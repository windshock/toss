package o;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.util.List;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda8 {
    public static Uri IAuthTabCallback(@Nullable String str, @Nullable String str2) {
        return Uri.parse(onWarmupCompleted(str, str2));
    }

    public static String onWarmupCompleted(@Nullable String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrOnExtraCallbackWithResult = onExtraCallbackWithResult(str2);
        if (iArrOnExtraCallbackWithResult[0] != -1) {
            sb.append(str2);
            onExtraCallback(sb, iArrOnExtraCallbackWithResult[1], iArrOnExtraCallbackWithResult[2]);
            return sb.toString();
        }
        int[] iArrOnExtraCallbackWithResult2 = onExtraCallbackWithResult(str);
        if (iArrOnExtraCallbackWithResult[3] == 0) {
            sb.append((CharSequence) str, 0, iArrOnExtraCallbackWithResult2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrOnExtraCallbackWithResult[2] == 0) {
            sb.append((CharSequence) str, 0, iArrOnExtraCallbackWithResult2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = iArrOnExtraCallbackWithResult[1];
        if (i2 != 0) {
            int i3 = iArrOnExtraCallbackWithResult2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return onExtraCallback(sb, iArrOnExtraCallbackWithResult[1] + i3, i3 + iArrOnExtraCallbackWithResult[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, iArrOnExtraCallbackWithResult2[1]);
            sb.append(str2);
            int i4 = iArrOnExtraCallbackWithResult2[1];
            return onExtraCallback(sb, i4, iArrOnExtraCallbackWithResult[2] + i4);
        }
        int i5 = iArrOnExtraCallbackWithResult2[0];
        int i6 = iArrOnExtraCallbackWithResult2[1];
        if (i5 + 2 < i6 && i6 == iArrOnExtraCallbackWithResult2[2]) {
            sb.append((CharSequence) str, 0, i6);
            sb.append('/');
            sb.append(str2);
            int i7 = iArrOnExtraCallbackWithResult2[1];
            return onExtraCallback(sb, i7, iArrOnExtraCallbackWithResult[2] + i7 + 1);
        }
        int iLastIndexOf = str.lastIndexOf(47, iArrOnExtraCallbackWithResult2[2] - 1);
        int i8 = iLastIndexOf == -1 ? iArrOnExtraCallbackWithResult2[1] : iLastIndexOf + 1;
        sb.append((CharSequence) str, 0, i8);
        sb.append(str2);
        return onExtraCallback(sb, iArrOnExtraCallbackWithResult2[1], i8 + iArrOnExtraCallbackWithResult[2]);
    }

    private static String onExtraCallback(StringBuilder sb, int i2, int i3) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] onExtraCallbackWithResult(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String onNavigationEvent(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !Ascii.equalsIgnoreCase(scheme, scheme2)) : scheme2 == null) {
            if (Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int iMin = Math.min(pathSegments.size(), pathSegments2.size());
                int i2 = 0;
                for (int i3 = 0; i3 < iMin && pathSegments.get(i3).equals(pathSegments2.get(i3)); i3++) {
                    i2++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i4 = i2; i4 < pathSegments.size(); i4++) {
                    sb.append("../");
                }
                while (i2 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i2));
                    if (i2 < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i2++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }
}
