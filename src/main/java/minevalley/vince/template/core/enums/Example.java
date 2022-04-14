package minevalley.vince.template.core.enums;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Example {

    EXAMPLE_1(1),
    EXAMPLE_2(2),
    EXAMPLE_3(3);

    private final int value;
}
