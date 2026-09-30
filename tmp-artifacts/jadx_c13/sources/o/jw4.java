package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface jw4<Object, Field> extends removePauseListener<Object, Field> {
    Field onNavigationEvent(Object object);

    default Field onExtraCallback(Object object) {
        Field fieldOnNavigationEvent = onNavigationEvent(object);
        if (fieldOnNavigationEvent != null) {
            return fieldOnNavigationEvent;
        }
        throw new IllegalStateException("Field " + onWarmupCompleted() + " is not set");
    }
}
