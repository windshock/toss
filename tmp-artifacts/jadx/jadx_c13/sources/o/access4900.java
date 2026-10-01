package o;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface access4900<R> extends access4600 {
    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<access5600, ? extends Object> map);

    String getName();

    List<access5600> getParameters();

    access5900 getReturnType();

    List<addCauses> getTypeParameters();

    addCommandLineBytes getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
