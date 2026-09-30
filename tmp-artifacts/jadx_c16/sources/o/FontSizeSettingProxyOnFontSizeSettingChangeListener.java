package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FontSizeSettingProxyOnFontSizeSettingChangeListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("accountList")
    private final List<onNavigationEvent> accountList;

    @SerializedName("alreadyCheckedName")
    private final boolean alreadyCheckedName;

    @SerializedName("verifyingMethod")
    private final String verifyingMethod;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof FontSizeSettingProxyOnFontSizeSettingChangeListener)) {
            return false;
        }
        FontSizeSettingProxyOnFontSizeSettingChangeListener fontSizeSettingProxyOnFontSizeSettingChangeListener = (FontSizeSettingProxyOnFontSizeSettingChangeListener) obj;
        if (this.alreadyCheckedName != fontSizeSettingProxyOnFontSizeSettingChangeListener.alreadyCheckedName) {
            int i4 = IAuthTabCallback + 125;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.accountList, fontSizeSettingProxyOnFontSizeSettingChangeListener.accountList)) {
            int i5 = IAuthTabCallback + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.verifyingMethod, fontSizeSettingProxyOnFontSizeSettingChangeListener.verifyingMethod)) {
            return false;
        }
        int i7 = onExtraCallback + 115;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.alreadyCheckedName) * 31) + this.accountList.hashCode()) * 31) + this.verifyingMethod.hashCode();
        int i4 = onExtraCallback + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddAccountsReadonlyReqDto(alreadyCheckedName=" + this.alreadyCheckedName + ", accountList=" + this.accountList + ", verifyingMethod=" + this.verifyingMethod + ")";
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public FontSizeSettingProxyOnFontSizeSettingChangeListener(boolean z, @NotNull List<onNavigationEvent> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.alreadyCheckedName = z;
        this.accountList = list;
        this.verifyingMethod = str;
    }
}
