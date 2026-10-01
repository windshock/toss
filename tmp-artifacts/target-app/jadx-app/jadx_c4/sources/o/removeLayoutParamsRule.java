package o;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeLayoutParamsRule implements previewLayout {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final SharedPreferences onExtraCallbackWithResult;
    private final HashMap<Class<?>, drawProgressReverse<?>> onNavigationEvent;

    public removeLayoutParamsRule(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.onExtraCallbackWithResult = sharedPreferences;
        this.onNavigationEvent = new HashMap<>();
        onExtraCallbackWithResult();
    }

    public static final /* synthetic */ SharedPreferences.Editor IAuthTabCallback(removeLayoutParamsRule removelayoutparamsrule) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorAsBinder = removelayoutparamsrule.asBinder();
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return editorAsBinder;
    }

    public static final /* synthetic */ SharedPreferences onWarmupCompleted(removeLayoutParamsRule removelayoutparamsrule) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SharedPreferences sharedPreferences = removelayoutparamsrule.onExtraCallbackWithResult;
        int i5 = i3 + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return sharedPreferences;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.previewLayout
    public /* synthetic */ Map onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            throw null;
        }
        HashMap<Class<?>, drawProgressReverse<?>> mapOnNavigationEvent = onNavigationEvent();
        int i3 = IAuthTabCallback + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return mapOnNavigationEvent;
    }

    private final SharedPreferences.Editor asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences.Editor editorEdit = this.onExtraCallbackWithResult.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return editorEdit;
    }

    public HashMap<Class<?>, drawProgressReverse<?>> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback();
        onWarmupCompleted();
        IAuthTabCallbackStub();
        asInterface();
        onTransact();
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted implements drawProgressReverse<Boolean> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        onWarmupCompleted() {
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ void onExtraCallbackWithResult(String str, Boolean bool, boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = bool.booleanValue();
            if (i3 != 0) {
                onNavigationEvent(str, zBooleanValue, z);
            } else {
                onNavigationEvent(str, zBooleanValue, z);
                int i4 = 18 / 0;
            }
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ Boolean onNavigationEvent(String str, Boolean bool) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolIAuthTabCallback = IAuthTabCallback(str, bool);
            int i4 = onExtraCallback + 119;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 50 / 0;
            }
            return boolIAuthTabCallback;
        }

        public Boolean IAuthTabCallback(String str, Boolean bool) {
            boolean zBooleanValue;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).contains(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (!removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).contains(str)) {
                return bool;
            }
            SharedPreferences sharedPreferencesOnWarmupCompleted = removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                int i3 = onNavigationEvent + 81;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(sharedPreferencesOnWarmupCompleted.getBoolean(str, zBooleanValue));
        }

        public void onNavigationEvent(String str, boolean z, boolean z2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorPutBoolean = removeLayoutParamsRule.IAuthTabCallback(removeLayoutParamsRule.this).putBoolean(str, z);
            if (!z2) {
                editorPutBoolean.apply();
                return;
            }
            int i2 = onExtraCallback + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            editorPutBoolean.commit();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        onNavigationEvent().put(Boolean.class, onwarmupcompleted);
        onNavigationEvent().put(Boolean.TYPE, onwarmupcompleted);
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallback implements drawProgressReverse<Float> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        onExtraCallback() {
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ void onExtraCallbackWithResult(String str, Float f, boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(str, f.floatValue(), z);
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.drawProgressReverse
        public /* bridge */ /* synthetic */ Float onNavigationEvent(String str, Float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Float fOnNavigationEvent2 = onNavigationEvent2(str, f);
            int i4 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return fOnNavigationEvent2;
        }

        /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
        public Float onNavigationEvent2(String str, Float f) {
            float fFloatValue;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (!removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).contains(str)) {
                int i2 = onNavigationEvent + 87;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return f;
            }
            SharedPreferences sharedPreferencesOnWarmupCompleted = removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this);
            if (f != null) {
                int i4 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                fFloatValue = f.floatValue();
                int i6 = onNavigationEvent + 75;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            } else {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(sharedPreferencesOnWarmupCompleted.getFloat(str, fFloatValue));
        }

        public void onNavigationEvent(String str, float f, boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorPutFloat = removeLayoutParamsRule.IAuthTabCallback(removeLayoutParamsRule.this).putFloat(str, f);
            if (z) {
                editorPutFloat.commit();
                return;
            }
            editorPutFloat.apply();
            int i4 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
        }
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        onExtraCallback onextracallback = new onExtraCallback();
        onNavigationEvent().put(Float.class, onextracallback);
        onNavigationEvent().put(Float.TYPE, onextracallback);
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onNavigationEvent implements drawProgressReverse<Integer> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        onNavigationEvent() {
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ void onExtraCallbackWithResult(String str, Integer num, boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(str, num.intValue(), z);
            int i4 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ Integer onNavigationEvent(String str, Integer num) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            Integer num2 = num;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(str, num2);
            }
            IAuthTabCallback(str, num2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Integer IAuthTabCallback(String str, Integer num) {
            int iIntValue;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (!removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).contains(str)) {
                return num;
            }
            int i4 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this);
                obj.hashCode();
                throw null;
            }
            SharedPreferences sharedPreferencesOnWarmupCompleted = removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this);
            if (num != null) {
                int i5 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    num.intValue();
                    obj.hashCode();
                    throw null;
                }
                iIntValue = num.intValue();
            } else {
                int i6 = IAuthTabCallback + 125;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 2;
                }
                iIntValue = 0;
            }
            return Integer.valueOf(sharedPreferencesOnWarmupCompleted.getInt(str, iIntValue));
        }

        public void onNavigationEvent(String str, int i, boolean z) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                removeLayoutParamsRule.IAuthTabCallback(removeLayoutParamsRule.this).putInt(str, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorPutInt = removeLayoutParamsRule.IAuthTabCallback(removeLayoutParamsRule.this).putInt(str, i);
            if (!z) {
                editorPutInt.apply();
                return;
            }
            editorPutInt.commit();
            int i4 = onExtraCallbackWithResult + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
        }
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = new onNavigationEvent();
        onNavigationEvent().put(Integer.class, onnavigationevent);
        onNavigationEvent().put(Integer.TYPE, onnavigationevent);
        int i2 = IAuthTabCallback + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    public static final class onExtraCallbackWithResult implements drawProgressReverse<Long> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        onExtraCallbackWithResult() {
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ void onExtraCallbackWithResult(String str, Long l, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i2 % 128;
            Long l2 = l;
            if (i2 % 2 == 0) {
                IAuthTabCallback(str, l2.longValue(), z);
                throw null;
            }
            IAuthTabCallback(str, l2.longValue(), z);
            int i3 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.drawProgressReverse
        public /* bridge */ /* synthetic */ Long onNavigationEvent(String str, Long l) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Long lOnNavigationEvent2 = onNavigationEvent2(str, l);
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            int i5 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return lOnNavigationEvent2;
        }

        /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
        public Long onNavigationEvent2(String str, Long l) {
            long jLongValue;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (!removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).contains(str)) {
                return l;
            }
            int i2 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SharedPreferences sharedPreferencesOnWarmupCompleted = removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this);
            if (l != null) {
                int i4 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    l.longValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            return Long.valueOf(sharedPreferencesOnWarmupCompleted.getLong(str, jLongValue));
        }

        public void IAuthTabCallback(String str, long j, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            SharedPreferences.Editor editorPutLong = removeLayoutParamsRule.IAuthTabCallback(removeLayoutParamsRule.this).putLong(str, j);
            if (!z) {
                editorPutLong.apply();
                int i4 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            editorPutLong.commit();
            if (i7 != 0) {
                throw null;
            }
        }
    }

    private final void asInterface() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        onNavigationEvent().put(Long.class, onextracallbackwithresult);
        onNavigationEvent().put(Long.TYPE, onextracallbackwithresult);
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
    }

    public static final class IAuthTabCallback implements drawProgressReverse<String> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        IAuthTabCallback() {
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ void onExtraCallbackWithResult(String str, String str2, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(str, str2, z);
            if (i3 == 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.drawProgressReverse
        public /* synthetic */ String onNavigationEvent(String str, String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            String str3 = str2;
            if (i2 % 2 != 0) {
                return onExtraCallback(str, str3);
            }
            onExtraCallback(str, str3);
            throw null;
        }

        public String onExtraCallback(String str, String str2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                return removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).getString(str, str2);
            }
            Intrinsics.checkNotNullParameter(str, "");
            removeLayoutParamsRule.onWarmupCompleted(removeLayoutParamsRule.this).getString(str, str2);
            throw null;
        }

        public void onExtraCallback(String str, String str2, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            SharedPreferences.Editor editorPutString = removeLayoutParamsRule.IAuthTabCallback(removeLayoutParamsRule.this).putString(str, str2);
            if (!z) {
                editorPutString.apply();
                return;
            }
            editorPutString.commit();
            int i4 = IAuthTabCallback + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
            }
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        onNavigationEvent().put(String.class, new IAuthTabCallback());
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
    }
}
