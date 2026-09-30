package com.tnkfactory.ad.tnkassert;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tnkfactory.ad.a.b0;
import com.tnkfactory.ad.a.z;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OfferwallTabClick extends AssertData {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27242, 27155, 27173, 27170, 27194, 27170};
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public String c;
    public String d;
    public HashMap e;
    public HashMap f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f60i;
    public int j;
    public int k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallTabClick(@NotNull String str, @NotNull String str2, @NotNull HashMap<Integer, Integer> map, @NotNull HashMap<Integer, Integer> map2, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = map2;
        this.g = i2;
        this.h = i3;
        this.f60i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
    }

    public static /* synthetic */ OfferwallTabClick copy$default(OfferwallTabClick offerwallTabClick, String str, String str2, HashMap map, HashMap map2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        int i13 = onNavigationEvent;
        int i14 = i13 + 41;
        onExtraCallbackWithResult = i14 % 128;
        int i15 = i14 % 2;
        String str3 = (i8 & 1) != 0 ? offerwallTabClick.c : str;
        String str4 = (i8 & 2) != 0 ? offerwallTabClick.d : str2;
        HashMap map3 = (i8 & 4) != 0 ? offerwallTabClick.e : map;
        HashMap map4 = (i8 & 8) != 0 ? offerwallTabClick.f : map2;
        int i16 = (i8 & 16) != 0 ? offerwallTabClick.g : i2;
        int i17 = (i8 & 32) != 0 ? offerwallTabClick.h : i3;
        if ((i8 & 64) != 0) {
            int i18 = i13 + 109;
            onExtraCallbackWithResult = i18 % 128;
            if (i18 % 2 == 0) {
                i9 = offerwallTabClick.f60i;
                int i19 = 30 / 0;
            } else {
                i9 = offerwallTabClick.f60i;
            }
        } else {
            i9 = i4;
        }
        if ((i8 & 128) != 0) {
            int i20 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
            i10 = offerwallTabClick.j;
        } else {
            i10 = i5;
        }
        int i22 = (i8 & 256) != 0 ? offerwallTabClick.k : i6;
        if ((i8 & 512) != 0) {
            int i23 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i23 % 128;
            int i24 = i23 % 2;
            i11 = offerwallTabClick.l;
        } else {
            i11 = i7;
        }
        return offerwallTabClick.copy(str3, str4, map3, map4, i16, i17, i9, i10, i22, i11);
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = this.c;
        int i6 = i3 + 35;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component10() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.d;
        if (i4 != 0) {
            int i5 = 76 / 0;
        }
        return str;
    }

    public final HashMap<Integer, Integer> component3() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        HashMap<Integer, Integer> map = this.e;
        int i6 = i3 + 35;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public final HashMap<Integer, Integer> component4() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 1;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HashMap<Integer, Integer> map = this.f;
        int i5 = i3 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return map;
    }

    public final int component5() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.g;
        int i7 = i3 + 33;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int component6() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.h;
        int i7 = i3 + 111;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 69 / 0;
        }
        return i6;
    }

    public final int component7() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f60i;
        int i7 = i3 + 109;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int component8() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.j;
        int i7 = i3 + 101;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 31 / 0;
        }
        return i6;
    }

    public final int component9() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.k;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OfferwallTabClick copy(@NotNull String str, @NotNull String str2, @NotNull HashMap<Integer, Integer> map, @NotNull HashMap<Integer, Integer> map2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        OfferwallTabClick offerwallTabClick = new OfferwallTabClick(str, str2, map, map2, i2, i3, i4, i5, i6, i7);
        int i9 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return offerwallTabClick;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.tnkfactory.ad.tnkassert.OfferwallTabClick) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 41;
        com.tnkfactory.ad.tnkassert.OfferwallTabClick.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (com.tnkfactory.ad.tnkassert.OfferwallTabClick) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.c, r7.c) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r7 = com.tnkfactory.ad.tnkassert.OfferwallTabClick.onNavigationEvent + 99;
        com.tnkfactory.ad.tnkassert.OfferwallTabClick.onExtraCallbackWithResult = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.d, r7.d) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.e, r7.e) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.f, r7.f) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r6.g == r7.g) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r7 = com.tnkfactory.ad.tnkassert.OfferwallTabClick.onExtraCallbackWithResult + 27;
        r1 = r7 % 128;
        com.tnkfactory.ad.tnkassert.OfferwallTabClick.onNavigationEvent = r1;
        r7 = r7 % 2;
        r1 = r1 + 111;
        com.tnkfactory.ad.tnkassert.OfferwallTabClick.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if ((r1 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r6.h == r7.h) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r7 = com.tnkfactory.ad.tnkassert.OfferwallTabClick.onNavigationEvent + 69;
        com.tnkfactory.ad.tnkassert.OfferwallTabClick.onExtraCallbackWithResult = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if ((r7 % 2) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        if (r6.f60i == r7.f60i) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        if (r6.j == r7.j) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r6.k == r7.k) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        if (r6.l == r7.l) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String getDocName() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 51;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return "offerwalltabclick";
    }

    public final HashMap<Integer, Integer> getFreeChargingStation1() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        HashMap<Integer, Integer> map = this.e;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return map;
    }

    public final HashMap<Integer, Integer> getFreeChargingStation2() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        HashMap<Integer, Integer> map = this.f;
        int i6 = i3 + 77;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public final int getParticipationList1() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.g;
        int i7 = i3 + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getParticipationList2() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.h;
        if (i4 != 0) {
            int i6 = 45 / 0;
        }
        return i5;
    }

    public final int getParticipationList3() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f60i;
        int i7 = i3 + 79;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getParticipationList4() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return this.j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getParticipationList5() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.k;
        if (i4 != 0) {
            int i6 = 19 / 0;
        }
        return i5;
    }

    public final int getRefererTab() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.l;
        int i6 = i3 + 89;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getUnitId() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.d;
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        return str;
    }

    public final String getUserId() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = this.c;
        int i6 = i3 + 39;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setFreeChargingStation1(@NotNull HashMap<Integer, Integer> map) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.e = map;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            this.e = map;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setFreeChargingStation2(@NotNull HashMap<Integer, Integer> map) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        this.f = map;
        int i5 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void setParticipationList1(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 5;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.g = i2;
        int i7 = i5 + 93;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 86 / 0;
        }
    }

    public final void setParticipationList2(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.h = i2;
        int i7 = i4 + 115;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setParticipationList3(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 35;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        this.f60i = i2;
        int i7 = i5 + 113;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 44 / 0;
        }
    }

    public final void setParticipationList4(int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.j = i2;
        if (i5 != 0) {
            int i6 = 7 / 0;
        }
    }

    public final void setParticipationList5(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 15;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        this.k = i2;
        int i7 = i5 + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setRefererTab(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 117;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        this.l = i2;
        int i7 = i5 + 71;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setUnitId(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.d = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.d = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setUserId(@NotNull String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.c = str;
        int i5 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "OfferwallTabClick(userId=" + this.c + ", unitId=" + this.d + ", freeChargingStation1=" + this.e + ", freeChargingStation2=" + this.f + ", participationList1=" + this.g + ", participationList2=" + this.h + ", participationList3=" + this.f60i + ", participationList4=" + this.j + ", participationList5=" + this.k + ", refererTab=" + this.l + ")";
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    public final void resetData() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            this.e.clear();
            this.f.clear();
            this.g = 0;
            this.h = 1;
            this.f60i = 0;
            this.j = 1;
            this.k = 0;
            this.l = 1;
            return;
        }
        this.e.clear();
        this.f.clear();
        this.g = 0;
        this.h = 0;
        this.f60i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iA = b0.a(this.d, this.c.hashCode() * 31, 31);
        int iHashCode = this.e.hashCode();
        int iHashCode2 = Integer.hashCode(this.l) + z.a(this.k, z.a(this.j, z.a(this.f60i, z.a(this.h, z.a(this.g, (this.f.hashCode() + ((iHashCode + iA) * 31)) * 31, 31), 31), 31), 31), 31);
        int i5 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode2;
    }

    @Override // com.tnkfactory.ad.tnkassert.AssertData
    public String postData() throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr = new Object[1];
        m(new int[]{0, 6, 0, 5}, true, new byte[]{1, 1, 1, 0, 0, 1}, objArr);
        jSONObject.put(((String) objArr[0]).intern(), this.c);
        jSONObject.put("unitId", this.d);
        int i3 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        for (Map.Entry entry : this.e.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            jSONObject.put("freeChargingStation1_" + iIntValue, ((Number) entry.getValue()).intValue());
        }
        for (Map.Entry entry2 : this.f.entrySet()) {
            int iIntValue2 = ((Number) entry2.getKey()).intValue();
            jSONObject.put("freeChargingStation2_" + iIntValue2, ((Number) entry2.getValue()).intValue());
        }
        jSONObject.put("participationList1", this.g);
        jSONObject.put("participationList2", this.h);
        jSONObject.put("participationList3", this.f60i);
        jSONObject.put("participationList4", this.j);
        jSONObject.put("participationList5", this.k);
        jSONObject.put("refererTab", this.l);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private static void m(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.MeasureSpec.getSize(0) + 35, 14239 - View.getDefaultSize(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.argb(0, 0, 0, 0)), 65 - View.MeasureSpec.getMode(0), 16718 - ExpandableListView.getPackedPositionGroup(0L), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 29, Color.red(0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 70 - (Process.myTid() >> 22), (Process.myPid() >> 22) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i12 = $10 + 35;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
            int i15 = $11 + 81;
            $10 = i15 % 128;
            int i16 = i15 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 9;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
