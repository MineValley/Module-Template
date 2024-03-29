package minevalley.vince.template.core;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Example {

    private final static Map<String, Example> cachedExamples = Maps.newHashMap();

    private final String string;
    private final int integer;

}