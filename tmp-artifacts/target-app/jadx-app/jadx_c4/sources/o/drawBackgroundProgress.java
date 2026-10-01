package o;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class drawBackgroundProgress {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ void onNavigationEvent(TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            z = false;
        }
        onExtraCallbackWithResult(textRoundCornerProgressBarSavedState1, (List<? extends Pair<String, ? extends Object>>) list, z);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, Collection collection, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 2) != 0) {
            z = false;
        }
        onExtraCallback(textRoundCornerProgressBarSavedState1, collection, z);
        int i4 = IAuthTabCallback + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull List<? extends Pair<String, ? extends Object>> list, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
            Intrinsics.checkNotNullParameter(list, "");
            textRoundCornerProgressBarSavedState1.onExtraCallback().edit();
            list.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(list, "");
        SharedPreferences.Editor editorEdit = textRoundCornerProgressBarSavedState1.onExtraCallback().edit();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.onExtraCallbackWithResult();
            Object objIAuthTabCallback = pair.IAuthTabCallback();
            if (objIAuthTabCallback instanceof String) {
                editorEdit.putString(str, (String) objIAuthTabCallback);
                int i3 = IAuthTabCallback + 15;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            } else if (objIAuthTabCallback instanceof Integer) {
                editorEdit.putInt(str, ((Number) objIAuthTabCallback).intValue());
            } else if (objIAuthTabCallback instanceof Long) {
                editorEdit.putLong(str, ((Number) objIAuthTabCallback).longValue());
            } else if (objIAuthTabCallback instanceof Float) {
                editorEdit.putFloat(str, ((Number) objIAuthTabCallback).floatValue());
            } else if (!(objIAuthTabCallback instanceof Boolean)) {
                onVisit.IAuthTabCallback(editorEdit);
                Objects.toString(objIAuthTabCallback);
            } else {
                editorEdit.putBoolean(str, ((Boolean) objIAuthTabCallback).booleanValue());
            }
        }
        if (!z) {
            editorEdit.apply();
            return;
        }
        int i5 = IAuthTabCallback + 47;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            editorEdit.commit();
        } else {
            editorEdit.commit();
            int i6 = 2 / 0;
        }
    }

    public static final void onExtraCallback(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull Collection<String> collection, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(collection, "");
        SharedPreferences.Editor editorEdit = textRoundCornerProgressBarSavedState1.onExtraCallback().edit();
        Iterator<T> it = collection.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                if (!z) {
                    editorEdit.apply();
                    return;
                }
                int i2 = onNavigationEvent + 57;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    editorEdit.commit();
                    return;
                } else {
                    editorEdit.commit();
                    throw null;
                }
            }
            int i3 = onNavigationEvent + 117;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                editorEdit.remove((String) it.next());
                obj.hashCode();
                throw null;
            }
            editorEdit.remove((String) it.next());
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, @NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = textRoundCornerProgressBarSavedState1.onExtraCallback().edit();
        editorEdit.remove(str);
        if (!z) {
            editorEdit.apply();
            return;
        }
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            editorEdit.commit();
            return;
        }
        editorEdit.commit();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IAuthTabCallback(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        SharedPreferences.Editor editorEdit = textRoundCornerProgressBarSavedState1.onExtraCallback().edit();
        editorEdit.clear();
        if (!z) {
            editorEdit.apply();
            return;
        }
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        editorEdit.commit();
    }
}
