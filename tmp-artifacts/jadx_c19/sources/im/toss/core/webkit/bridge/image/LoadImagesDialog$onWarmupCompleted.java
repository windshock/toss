package im.toss.core.webkit.bridge.image;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LoadImagesDialog$onWarmupCompleted {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoadImagesDialog$onWarmupCompleted[] $VALUES;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final LoadImagesDialog$onWarmupCompleted GALLERY = new LoadImagesDialog$onWarmupCompleted("GALLERY", 0);
    public static final LoadImagesDialog$onWarmupCompleted CAMERA = new LoadImagesDialog$onWarmupCompleted("CAMERA", 1);

    private static final /* synthetic */ LoadImagesDialog$onWarmupCompleted[] $values() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        LoadImagesDialog$onWarmupCompleted[] loadImagesDialog$onWarmupCompletedArr = {GALLERY, CAMERA};
        int i6 = i3 + 99;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return loadImagesDialog$onWarmupCompletedArr;
    }

    public static EnumEntries<LoadImagesDialog$onWarmupCompleted> getEntries() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<LoadImagesDialog$onWarmupCompleted> enumEntries = $ENTRIES;
        int i6 = i3 + 125;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return enumEntries;
    }

    public static LoadImagesDialog$onWarmupCompleted valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LoadImagesDialog$onWarmupCompleted loadImagesDialog$onWarmupCompleted = (LoadImagesDialog$onWarmupCompleted) Enum.valueOf(LoadImagesDialog$onWarmupCompleted.class, str);
        if (i4 != 0) {
            throw null;
        }
        int i5 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return loadImagesDialog$onWarmupCompleted;
        }
        throw null;
    }

    public static LoadImagesDialog$onWarmupCompleted[] values() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        LoadImagesDialog$onWarmupCompleted[] loadImagesDialog$onWarmupCompletedArr = $VALUES;
        if (i4 != 0) {
            return (LoadImagesDialog$onWarmupCompleted[]) loadImagesDialog$onWarmupCompletedArr.clone();
        }
        int i5 = 68 / 0;
        return (LoadImagesDialog$onWarmupCompleted[]) loadImagesDialog$onWarmupCompletedArr.clone();
    }

    private LoadImagesDialog$onWarmupCompleted(String str, int i2) {
    }

    static {
        LoadImagesDialog$onWarmupCompleted[] loadImagesDialog$onWarmupCompletedArr$values = $values();
        $VALUES = loadImagesDialog$onWarmupCompletedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(loadImagesDialog$onWarmupCompletedArr$values);
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
