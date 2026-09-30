package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.access8100;
import o.checkDetectionItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class checkDetectionItem {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    public static final checkDetectionItem onWarmupCompleted = new checkDetectionItem();
    private static final List<TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback> onNavigationEvent = CollectionsKt.listOf(new TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback[]{TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED});

    public static /* synthetic */ CharSequence onNavigationEvent(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(onextracallback, onextracallback2);
        int i5 = onExtraCallback + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return charSequenceOnExtraCallback;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(Map.Entry entry) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(entry);
        int i5 = IAuthTabCallback + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return charSequenceIAuthTabCallback;
    }

    private checkDetectionItem() {
    }

    static {
        int i2 = onExtraCallbackWithResult + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final CharSequence onExtraCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback2) {
        StringBuilder sb;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallback2, "");
            StringsKt.first(onextracallback2.name());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallback2, "");
        char cFirst = StringsKt.first(onextracallback2.name());
        if (onextracallback2 == onextracallback) {
            sb = new StringBuilder();
            str = "*";
        } else {
            sb = new StringBuilder();
            str = " ";
        }
        sb.append(str);
        sb.append(cFirst);
        String string = sb.toString();
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static final CharSequence IAuthTabCallback(Map.Entry entry) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        String str = entry.getKey() + "=" + entry.getValue();
        int i3 = IAuthTabCallback + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String onExtraCallback(@NotNull String str, @NotNull final TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, @NotNull Map<String, ? extends Object> map) {
        int i2 = 2 % 2;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(map, "");
        String strJoinToString$default = CollectionsKt.joinToString$default(onNavigationEvent, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.core.utils.LifecycleLog$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    checkDetectionItem.onNavigationEvent(onextracallback, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) obj);
                    throw null;
                }
                CharSequence charSequenceOnNavigationEvent = checkDetectionItem.onNavigationEvent(onextracallback, (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) obj);
                int i5 = onExtraCallbackWithResult + 57;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return charSequenceOnNavigationEvent;
            }
        }, 30, (Object) null);
        Set<Map.Entry<String, ? extends Object>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                String strJoinToString$default2 = CollectionsKt.joinToString$default(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: im.toss.core.utils.LifecycleLog$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 29;
                        onWarmupCompleted = i4 % 128;
                        Map.Entry entry = (Map.Entry) obj2;
                        if (i4 % 2 != 0) {
                            checkDetectionItem.onWarmupCompleted(entry);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        CharSequence charSequenceOnWarmupCompleted = checkDetectionItem.onWarmupCompleted(entry);
                        int i5 = onWarmupCompleted + 61;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return charSequenceOnWarmupCompleted;
                    }
                }, 30, (Object) null);
                String strPadEnd$default = StringsKt.padEnd$default(str, 25, (char) 0, 2, (Object) null);
                if (strJoinToString$default2.length() > 0) {
                    str2 = " (" + strJoinToString$default2 + ")";
                }
                return strPadEnd$default + " " + strJoinToString$default + str2;
            }
            int i3 = onExtraCallback + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                ((Map.Entry) it.next()).getValue();
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (((Map.Entry) next).getValue() != null) {
                int i4 = onExtraCallback + 89;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(next);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(next);
            }
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback, @NotNull Map<String, ? extends Object> map) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(map, "");
            onExtraCallback(str, onextracallback, map);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(map, "");
        onExtraCallback(str, onextracallback, map);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onNavigationEvent(checkDetectionItem checkdetectionitem, String str, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, Function0 function0, Function0 function02, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 37;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        if ((i2 & 8) != 0) {
            int i7 = i5 + 101;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i9 = i8 + 107;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            function02 = null;
        }
        checkdetectionitem.onNavigationEvent(str, textFieldScrollKtExternalSyntheticLambda0, function0, function02);
    }

    public final void onNavigationEvent(@NotNull final String str, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @Nullable final Function0<? extends Map<String, ? extends Object>> function0, @Nullable final Function0<Boolean> function02) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.core.utils.LifecycleLog$attach$1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            private final void IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback) {
                Map<String, ? extends Object> mapOnNavigationEvent;
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult;
                int i5 = i4 + 13;
                onNavigationEvent = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    Function0<Boolean> function03 = function02;
                    if (function03 != null) {
                        int i6 = i4 + 49;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (!((Boolean) function03.invoke()).booleanValue()) {
                                return;
                            }
                        } else {
                            ((Boolean) function03.invoke()).booleanValue();
                            obj.hashCode();
                            throw null;
                        }
                    }
                    checkDetectionItem checkdetectionitem = checkDetectionItem.onWarmupCompleted;
                    String str2 = str;
                    Function0<Map<String, Object>> function04 = function0;
                    if (function04 == null || (mapOnNavigationEvent = (Map) function04.invoke()) == null) {
                        mapOnNavigationEvent = access8100.onNavigationEvent();
                        int i7 = onExtraCallbackWithResult + 57;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    checkdetectionitem.onWarmupCompleted(str2, onextracallback, mapOnNavigationEvent);
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
                int i6 = onExtraCallbackWithResult + 35;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED);
                int i6 = onExtraCallbackWithResult + 5;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
                int i6 = onExtraCallbackWithResult + 83;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 119;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED);
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
                int i6 = onNavigationEvent + 111;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }

            public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i3 = 2 % 2;
                int i4 = onExtraCallbackWithResult + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                IAuthTabCallback(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED);
                textFieldScrollKtExternalSyntheticLambda02.getLifecycle().onExtraCallbackWithResult(this);
                int i6 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
