package Test;

import lombok.experimental.Delegate;
import lombok.experimental.ExtensionMethod;
import lombok.experimental.UtilityClass;

import java.security.cert.Extension;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

@ExtensionMethod(FunctionalInterface.class)
public class Memo {
    public static <T,R> Function<T , R> memoize(Function<T, R> function) {
        Map<T, R> cache = new ConcurrentHashMap<>();

        return arg -> {
            if (cache.containsKey(arg))
                return cache.get(arg);
            R tempValue = function.apply(arg);
            cache.put(arg, tempValue);
            return (tempValue);
        };
    }
}
