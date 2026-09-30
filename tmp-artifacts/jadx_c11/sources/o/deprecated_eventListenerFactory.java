package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_eventListenerFactory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ deprecated_eventListenerFactory[] $VALUES;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final deprecated_eventListenerFactory Unresolved = new deprecated_eventListenerFactory("Unresolved", 0);
    public static final deprecated_eventListenerFactory Logo = new deprecated_eventListenerFactory("Logo", 1);
    public static final deprecated_eventListenerFactory LogoFill = new deprecated_eventListenerFactory("LogoFill", 2);
    public static final deprecated_eventListenerFactory Icon = new deprecated_eventListenerFactory("Icon", 3);
    public static final deprecated_eventListenerFactory IconFill = new deprecated_eventListenerFactory("IconFill", 4);
    public static final deprecated_eventListenerFactory Apng = new deprecated_eventListenerFactory("Apng", 5);
    public static final deprecated_eventListenerFactory Emoji2D = new deprecated_eventListenerFactory("Emoji2D", 6);
    public static final deprecated_eventListenerFactory Emoji3D = new deprecated_eventListenerFactory("Emoji3D", 7);
    public static final deprecated_eventListenerFactory Lottie = new deprecated_eventListenerFactory("Lottie", 8);
    public static final deprecated_eventListenerFactory Image = new deprecated_eventListenerFactory("Image", 9);

    private static final /* synthetic */ deprecated_eventListenerFactory[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        deprecated_eventListenerFactory[] deprecated_eventlistenerfactoryArr = {Unresolved, Logo, LogoFill, Icon, IconFill, Apng, Emoji2D, Emoji3D, Lottie, Image};
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_eventlistenerfactoryArr;
    }

    public static EnumEntries<deprecated_eventListenerFactory> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<deprecated_eventListenerFactory> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return enumEntries;
    }

    public static deprecated_eventListenerFactory valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_eventListenerFactory deprecated_eventlistenerfactory = (deprecated_eventListenerFactory) Enum.valueOf(deprecated_eventListenerFactory.class, str);
        int i4 = onExtraCallbackWithResult + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_eventlistenerfactory;
    }

    public static deprecated_eventListenerFactory[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deprecated_eventListenerFactory[] deprecated_eventlistenerfactoryArr = $VALUES;
        if (i3 == 0) {
            return (deprecated_eventListenerFactory[]) deprecated_eventlistenerfactoryArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private deprecated_eventListenerFactory(String str, int i) {
    }

    static {
        deprecated_eventListenerFactory[] deprecated_eventlistenerfactoryArr$values = $values();
        $VALUES = deprecated_eventlistenerfactoryArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(deprecated_eventlistenerfactoryArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = onNavigationEvent + 19;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
