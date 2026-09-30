package o;

import im.toss.define.TossAffiliate;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPreviewSize {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final ReadWriteProperty onExtraCallbackWithResult;
    private static final ReadWriteProperty onNavigationEvent;
    private static final ReadWriteProperty onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new MutablePropertyReference1Impl<>(setPreviewSize.class, "loadUrlNotResponding", "getLoadUrlNotResponding()Z", 0), new MutablePropertyReference1Impl<>(setPreviewSize.class, "scriptNotResponding", "getScriptNotResponding()Z", 0), new MutablePropertyReference1Impl<>(setPreviewSize.class, "renderProcessUnresponsiveAtLeastOnce", "getRenderProcessUnresponsiveAtLeastOnce()Z", 0)};
    public static final setPreviewSize IAuthTabCallback = new setPreviewSize();

    private setPreviewSize() {
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult.setValue(this, onExtraCallback[0], Boolean.valueOf(z));
        int i4 = asInterface + 117;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        asBinder = i2 % 128;
        return ((Boolean) onExtraCallbackWithResult.getValue(this, i2 % 2 != 0 ? onExtraCallback[1] : onExtraCallback[0])).booleanValue();
    }

    public static final class onExtraCallbackWithResult extends ObservableProperty<Boolean> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public onExtraCallbackWithResult(Object obj) {
            super(obj);
        }

        public void afterChange(addAllCommandLine<?> addallcommandline, Boolean bool, Boolean bool2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                Intrinsics.checkNotNullParameter(addallcommandline, "");
                bool2.booleanValue();
                bool.booleanValue();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Boolean bool3 = bool2;
            boolean zBooleanValue = bool3.booleanValue();
            if (bool.booleanValue() != zBooleanValue) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("loadUrlNotResponding", bool3);
                setPreviewSize setpreviewsize = setPreviewSize.IAuthTabCallback;
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewFreezeMonitor", "loadUrlNotResponding goes to " + zBooleanValue, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("scriptNotResponding", Boolean.valueOf(setpreviewsize.onExtraCallback())), getWrite.IAuthTabCallback("renderProcessUnresponsiveAtLeastOnce", Boolean.valueOf(setpreviewsize.onNavigationEvent()))}), (String) null, false, (String) null, 56, (Object) null);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewFreezeMonitor", "loadUrlNotResponding goes to " + zBooleanValue, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("loadUrlNotResponding", bool3), getWrite.IAuthTabCallback("scriptNotResponding", Boolean.valueOf(setpreviewsize.onExtraCallback())), getWrite.IAuthTabCallback("renderProcessUnresponsiveAtLeastOnce", Boolean.valueOf(setpreviewsize.onNavigationEvent()))}), (String) null, false, TossAffiliate.SECURITIES.getLowerCaseName(), 24, (Object) null);
            }
            int i3 = onExtraCallback + 87;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onNavigationEvent extends ObservableProperty<Boolean> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public onNavigationEvent(Object obj) {
            super(obj);
        }

        public void afterChange(addAllCommandLine<?> addallcommandline, Boolean bool, Boolean bool2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Boolean bool3 = bool2;
            boolean zBooleanValue = bool3.booleanValue();
            if (bool.booleanValue() != zBooleanValue) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                setPreviewSize setpreviewsize = setPreviewSize.IAuthTabCallback;
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewFreezeMonitor", "renderProcessUnresponsiveAtLeastOnce goes to " + zBooleanValue, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("loadUrlNotResponding", Boolean.valueOf(setpreviewsize.onWarmupCompleted())), getWrite.IAuthTabCallback("scriptNotResponding", Boolean.valueOf(setpreviewsize.onExtraCallback())), getWrite.IAuthTabCallback("renderProcessUnresponsiveAtLeastOnce", bool3)}), (String) null, false, (String) null, 56, (Object) null);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewFreezeMonitor", "renderProcessUnresponsiveAtLeastOnce goes to " + zBooleanValue, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("loadUrlNotResponding", Boolean.valueOf(setpreviewsize.onWarmupCompleted())), getWrite.IAuthTabCallback("scriptNotResponding", Boolean.valueOf(setpreviewsize.onExtraCallback())), getWrite.IAuthTabCallback("renderProcessUnresponsiveAtLeastOnce", bool3)}), (String) null, false, TossAffiliate.SECURITIES.getLowerCaseName(), 24, (Object) null);
                int i4 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public static final class onWarmupCompleted extends ObservableProperty<Boolean> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public onWarmupCompleted(Object obj) {
            super(obj);
        }

        public void afterChange(addAllCommandLine<?> addallcommandline, Boolean bool, Boolean bool2) throws Throwable {
            int i;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Boolean bool3 = bool2;
            boolean zBooleanValue = bool3.booleanValue();
            if (bool.booleanValue() != zBooleanValue) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                setPreviewSize setpreviewsize = setPreviewSize.IAuthTabCallback;
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewFreezeMonitor", "scriptNotResponding goes to " + zBooleanValue, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("loadUrlNotResponding", Boolean.valueOf(setpreviewsize.onWarmupCompleted())), getWrite.IAuthTabCallback("scriptNotResponding", bool3), getWrite.IAuthTabCallback("renderProcessUnresponsiveAtLeastOnce", Boolean.valueOf(setpreviewsize.onNavigationEvent()))}), (String) null, false, (String) null, 56, (Object) null);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "WebViewFreezeMonitor", "scriptNotResponding goes to " + zBooleanValue, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("loadUrlNotResponding", Boolean.valueOf(setpreviewsize.onWarmupCompleted())), getWrite.IAuthTabCallback("scriptNotResponding", bool3), getWrite.IAuthTabCallback("renderProcessUnresponsiveAtLeastOnce", Boolean.valueOf(setpreviewsize.onNavigationEvent()))}), (String) null, false, TossAffiliate.SECURITIES.getLowerCaseName(), 24, (Object) null);
                int i3 = onExtraCallbackWithResult + 57;
                onExtraCallback = i3 % 128;
                i = 2;
                int i4 = i3 % 2;
            } else {
                i = 2;
            }
            int i5 = onExtraCallback + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % i != 0) {
                throw null;
            }
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) onWarmupCompleted.getValue(this, onExtraCallback[1])).booleanValue();
        int i4 = asInterface + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asBinder + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            readWriteProperty = onWarmupCompleted;
            addallcommandline = onExtraCallback[1];
        } else {
            readWriteProperty = onWarmupCompleted;
            addallcommandline = onExtraCallback[1];
        }
        readWriteProperty.setValue(this, addallcommandline, Boolean.valueOf(z));
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent.setValue(this, onExtraCallback[2], Boolean.valueOf(z));
        int i4 = asBinder + 29;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        boolean zBooleanValue = ((Boolean) (i2 % 2 == 0 ? onNavigationEvent.getValue(this, onExtraCallback[4]) : onNavigationEvent.getValue(this, onExtraCallback[2]))).booleanValue();
        int i3 = asBinder + 105;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        if (!onWarmupCompleted()) {
            int i2 = asInterface + 21;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                onNavigationEvent();
                throw null;
            }
            if (onNavigationEvent()) {
                if (onExtraCallback()) {
                    int i3 = asBinder + 99;
                    asInterface = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 99 / 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    static {
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        Boolean bool = Boolean.FALSE;
        onExtraCallbackWithResult = new onExtraCallbackWithResult(bool);
        onWarmupCompleted = new onWarmupCompleted(bool);
        onNavigationEvent = new onNavigationEvent(bool);
        int i = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
