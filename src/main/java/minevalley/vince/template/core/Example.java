package minevalley.vince.template.core;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class Example {

    private static Map<String, Example> cachedExamples = Maps.newHashMap();

    private final String string;
    private final int integer;

}