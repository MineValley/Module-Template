package minevalley.vince.template.core.calender;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nonnegative;

/**
 * Represents the four seasons of the year.
 * Each season has a starting month and a characteristic indicating whether it is generally considered cold.
 */
@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Season {

    SPRING(3, false),
    SUMMER(6, false),
    AUTUMN(9, true),
    WINTER(12, true);

    private final static int MONTHS_IN_YEAR = 12;

    private final @Nonnegative int startMonth;
    private final boolean isCold;

    /**
     * Gets the season corresponding to the given month.
     *
     * @param month the month (1-12)
     * @return the season for the given month
     * @throws IllegalArgumentException if month is not in the range 1-12
     */
    public static Season getSeasonByMonth(@Nonnegative int month) throws IllegalArgumentException {
        if (month < 1 || month > MONTHS_IN_YEAR) {
            throw new IllegalArgumentException("month must be in range 1..12");
        }

        for (Season season : values()) {
            int seasonStart = season.getStartMonth();
            int nextSeasonStart = season.getNextSeason().getStartMonth();

            if (month >= seasonStart && month < nextSeasonStart) {
                return season;
            }
        }
        return WINTER;
    }

    /**
     * Gets the previous season in the cycle.
     *
     * @return the previous season
     */
    public Season getPreviousSeason() {
        return values()[(this.ordinal() - 1 + values().length) % values().length];
    }

    /**
     * Gets the next season in the cycle.
     *
     * @return the next season
     */
    public Season getNextSeason() {
        return values()[(this.ordinal() + 1) % values().length];
    }

    /**
     * Calculates the progress within the season based on the current month.
     *
     * @param currentMonth the current month (1-12)
     * @return the progress in the season as a float between 0.0 and 1.0
     * @throws IllegalArgumentException if currentMonth is not in the range 1-12
     */
    public float getProgressInSeason(@Nonnegative int currentMonth) throws IllegalArgumentException {
        if (currentMonth < 1 || currentMonth > MONTHS_IN_YEAR) {
            throw new IllegalArgumentException("currentMonth must be in range 1..12");
        }

        int monthDifference = currentMonth - this.startMonth;
        if (monthDifference < 0) {
            monthDifference += MONTHS_IN_YEAR;
        }
        return monthDifference / 3f;
    }
}
