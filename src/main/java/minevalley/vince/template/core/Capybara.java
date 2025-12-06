package minevalley.vince.template.core;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import minevalley.vince.template.core.calender.Birthday;
import minevalley.vince.template.core.calender.Season;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;

/**
 * Represents a capybara with a name, birthday, favorite number, and mood.
 * Capybaras are known for their friendly and social nature.
 */
@Getter
@Setter
@AllArgsConstructor
public class Capybara {

    private final static Map<String, Capybara> cachedCapybaras = Maps.newHashMap();

    private final @Nonnull String name;
    private final @Nonnull Birthday birthday;
    private final int favoriteNumber;
    private int mood;

    /**
     * Gets a cached capybara by name.
     *
     * @param name the name of the capybara
     * @return the capybara with the given name, or null if not found
     */
    @Nullable
    @Contract(pure = true)
    public static Capybara getCapybara(@Nonnull final String name) {
        return cachedCapybaras.get(name);
    }

    /**
     * Gets all cached capybaras.
     *
     * @return a set of all cached capybaras
     */
    @Nonnull
    @Contract(value = "-> new", pure = true)
    public static Set<Capybara> getAllCapybaras() {
        return Set.copyOf(cachedCapybaras.values());
    }

    /**
     * Caches this capybara instance.
     * If a capybara with the same name already exists in the cache, it will be overwritten.
     */
    public void cache() {
        cachedCapybaras.put(this.name, this);
    }

    /**
     * Checks if the capybara has birthday today.
     *
     * @param currentDay   day of the month (1-31)
     * @param currentMonth month of the year (1-12)
     * @return true if the capybara has birthday today, false otherwise
     */
    @Contract(pure = true)
    public boolean hasBirthdayToday(@Nonnegative int currentDay, @Nonnegative int currentMonth) {
        return this.birthday.day() == currentDay && this.birthday.month() == currentMonth;
    }

    /**
     * Spends some love and increases the mood of the capybara by 1.
     */
    public void love() {
        mood++;
    }

    /**
     * Determines if the capybara is happy.
     *
     * @return true if the capybara's mood is 5 or higher, false otherwise
     */
    @Contract(pure = true)
    public boolean isHappy() {
        return mood >= 5;
    }

    /**
     * Determines if the capybara shivers in the given season.
     *
     * @param season the season to check
     * @return true if the capybara shivers in the given season, false otherwise
     * @throws IllegalArgumentException if the season is null
     */
    public boolean shivers(@Nonnull Season season) throws IllegalArgumentException {
        if (season == null) throw new IllegalArgumentException("Season cannot be null");
        return season.isCold();
    }
}