package minevalley.vince.template.core.calender;

import javax.annotation.Nonnull;

public record Birthday(@Nonnull String name, int day, int month, boolean isImportant) {

    public Birthday(@Nonnull String name, int day, int month) {
        this(name, day, month, false);
    }

    public Birthday {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }
    }
}
