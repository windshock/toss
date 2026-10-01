package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setCommandLine {

    public static final /* synthetic */ class IAuthTabCallback {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[setRevision.values().length];
            try {
                iArr[setRevision.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setRevision.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setRevision.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setRevision.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setRevision.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setRevision.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setRevision.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IAuthTabCallback_Parcel(long j) {
        return j * 1000000;
    }

    public static final long onWarmupCompleted(int i, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        if (setrevision.compareTo(setRevision.SECONDS) <= 0) {
            return onTransact(setSignalInfo.onExtraCallbackWithResult(i, setrevision, setRevision.NANOSECONDS));
        }
        return IAuthTabCallback(i, setrevision);
    }

    public static final long IAuthTabCallback(long j, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        setRevision setrevision2 = setRevision.NANOSECONDS;
        long jOnExtraCallbackWithResult = setSignalInfo.onExtraCallbackWithResult(4611686018426999999L, setrevision2, setrevision);
        if ((-jOnExtraCallbackWithResult) <= j && j <= jOnExtraCallbackWithResult) {
            return onTransact(setSignalInfo.onExtraCallbackWithResult(j, setrevision, setrevision2));
        }
        setRevision setrevision3 = setRevision.MILLISECONDS;
        if (setrevision.compareTo(setrevision3) >= 0) {
            return IAuthTabCallbackStub(getCurrentBacktraceOrBuilderList.onWarmupCompleted(j) * setSelinuxLabel.onExtraCallbackWithResult(Math.abs(RangesKt___RangesKt.coerceAtLeast(j, -9223372036854775807L)), setrevision));
        }
        return IAuthTabCallbackStub(RangesKt___RangesKt.coerceIn(setSignalInfo.onWarmupCompleted(j, setrevision, setrevision3), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long onExtraCallback(double d, @NotNull setRevision setrevision) {
        Intrinsics.checkNotNullParameter(setrevision, "");
        double dOnWarmupCompleted = setSignalInfo.onWarmupCompleted(d, setrevision, setRevision.NANOSECONDS);
        if (Double.isNaN(dOnWarmupCompleted)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jOnExtraCallback = getCurrentBacktraceOrBuilderList.onExtraCallback(dOnWarmupCompleted);
        if (-4611686018426999999L <= jOnExtraCallback && jOnExtraCallback < 4611686018427000000L) {
            return onTransact(jOnExtraCallback);
        }
        return asBinder(getCurrentBacktraceOrBuilderList.onExtraCallback(setSignalInfo.onWarmupCompleted(d, setrevision, setRevision.MILLISECONDS)));
    }

    static /* synthetic */ long onWarmupCompleted(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        return onExtraCallbackWithResult(str, z, z2);
    }

    private static final long onExtraCallbackWithResult(String str, boolean z, boolean z2) {
        int i;
        int i2;
        long jOnExtraCallbackWithResult;
        if (str.length() == 0) {
            if (z2) {
                throw new IllegalArgumentException("The string is empty");
            }
            return setLogBuffers.Companion.onExtraCallback();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '+') {
            i2 = cCharAt != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        boolean z3 = i2 > 0;
        if (str.length() <= i2) {
            if (z2) {
                throw new IllegalArgumentException("No components");
            }
            return setLogBuffers.Companion.onExtraCallback();
        }
        if (str.charAt(i2) == 'P') {
            jOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i2 + 1, z2);
        } else {
            if (z) {
                if (z2) {
                    throw new IllegalArgumentException(_UrlKt.FRAGMENT_ENCODE_SET);
                }
                return setLogBuffers.Companion.onExtraCallback();
            }
            if (StringsKt__StringsJVMKt.regionMatches(str, i2, "Infinity", 0, Math.max(str.length() - i2, 8), true)) {
                jOnExtraCallbackWithResult = setLogBuffers.Companion.onExtraCallbackWithResult();
            } else {
                jOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i2, z3, z2);
            }
        }
        return (i == 0 || setLogBuffers.IAuthTabCallback(jOnExtraCallbackWithResult, setLogBuffers.Companion.onExtraCallback())) ? jOnExtraCallbackWithResult : setLogBuffers.onActivityLayout(jOnExtraCallbackWithResult);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x0086
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long onExtraCallbackWithResult(java.lang.String r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCommandLine.onExtraCallbackWithResult(java.lang.String, int, boolean):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a2, code lost:
    
        throw new java.lang.IllegalArgumentException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
    
        r2 = -1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a8, code lost:
    
        r4 = onWarmupCompleted(r25, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ac, code lost:
    
        if (r4 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        r0 = "Unknown duration unit short name: " + r25.charAt(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
    
        if (r28 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01cb, code lost:
    
        return o.setLogBuffers.Companion.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d1, code lost:
    
        throw new java.lang.IllegalArgumentException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d2, code lost:
    
        if (r7 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d8, code lost:
    
        if (r7.compareTo(r4) > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01da, code lost:
    
        if (r28 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e2, code lost:
    
        return o.setLogBuffers.Companion.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ea, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected order of duration components");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01eb, code lost:
    
        r7 = o.setCommandLine.IAuthTabCallback.onExtraCallback[r4.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f4, code lost:
    
        if (r7 == 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01f7, code lost:
    
        if (r7 == 2) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f9, code lost:
    
        r8 = IAuthTabCallback(r8, o.setSelinuxLabel.onExtraCallbackWithResult(r5, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0203, code lost:
    
        r8 = r8 + (r5 / 1000000);
        r5 = r19 + (r5 % 1000000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020e, code lost:
    
        r8 = r8 + (r5 / 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021b, code lost:
    
        if (r8 > 4611686018426L) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021d, code lost:
    
        r5 = (r5 % 1000) * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021f, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0221, code lost:
    
        r5 = onExtraCallback(r4) + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0226, code lost:
    
        if (r3 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0228, code lost:
    
        if (r5 >= r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022a, code lost:
    
        if (r28 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0232, code lost:
    
        return o.setLogBuffers.Companion.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023a, code lost:
    
        throw new java.lang.IllegalArgumentException("Fractional component must be last");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0241, code lost:
    
        if (r4.compareTo(o.setRevision.MINUTES) < 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0247, code lost:
    
        if ((r5 - r2) <= 15) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0249, code lost:
    
        r2 = IAuthTabCallback(r25, r2, r5 - onExtraCallback(r4), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0254, code lost:
    
        r2 = onExtraCallback(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0258, code lost:
    
        r10 = r19 + r2;
        r7 = r4;
        r3 = r5;
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0260, code lost:
    
        r7 = r4;
        r3 = r5;
        r4 = r18;
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0267, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x026a, code lost:
    
        if (r28 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0272, code lost:
    
        return o.setLogBuffers.Companion.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0278, code lost:
    
        throw new java.lang.IllegalArgumentException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        if (r13 == r3) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e1, code lost:
    
        if (r13 == r1) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e9, code lost:
    
        if (r25.charAt(r13) != '.') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
    
        if (r3 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        r4 = r13 + 1;
        r10 = o.setSelinuxLabelBytes.IAuthTabCallback;
        r10 = java.lang.Math.min(r13 + 7, r25.length());
        r11 = r4;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
    
        if (r11 >= r10) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
    
        r12 = r25.charAt(r11);
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        if ('0' > r12) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
    
        if (r12 >= ':') goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        r14 = ((r14 << 3) + (r14 << 1)) + (r12 - '0');
        r11 = r11 + 1;
        r10 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0121, code lost:
    
        if (r10 >= (6 - (r11 - r4))) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0123, code lost:
    
        r14 = (r14 << 3) + (r14 << 1);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
    
        r10 = java.lang.Math.min(r11 + 9, r25.length());
        r12 = r11;
        r22 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0138, code lost:
    
        if (r12 >= r10) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013a, code lost:
    
        r23 = r10;
        r10 = r25.charAt(r12);
        r24 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0144, code lost:
    
        if ('0' > r10) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
    
        if (r10 >= ':') goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0148, code lost:
    
        r22 = ((r22 << 3) + (r22 << 1)) + (r10 - '0');
        r12 = r12 + 1;
        r10 = r23;
        r13 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:
    
        r24 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015b, code lost:
    
        r10 = r22;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0162, code lost:
    
        if (r13 >= (9 - (r12 - r11))) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0164, code lost:
    
        r10 = (r10 << 3) + (r10 << 1);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0172, code lost:
    
        if (r12 >= r25.length()) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0174, code lost:
    
        r11 = r25.charAt(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017a, code lost:
    
        if ('0' > r11) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017e, code lost:
    
        if (r11 >= ':') goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0180, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0183, code lost:
    
        if (r12 == r4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r12 == r1) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0187, code lost:
    
        r10 = (r14 * 1000000000) + r10;
        r2 = r24;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0194, code lost:
    
        if (r28 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019c, code lost:
    
        return o.setLogBuffers.Companion.onExtraCallback();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long onExtraCallbackWithResult(String str, int i, boolean z, boolean z2) {
        boolean z3;
        int i2;
        boolean z4;
        char cCharAt;
        int length = str.length();
        if (z && str.charAt(i) == '(' && str.charAt(length - 1) == ')') {
            i2 = i + 1;
            length--;
            if (i2 == length) {
                if (z2) {
                    throw new IllegalArgumentException("No components");
                }
                return setLogBuffers.Companion.onExtraCallback();
            }
            z3 = true;
        } else {
            z3 = !z;
            i2 = i;
        }
        setRevision setrevision = null;
        boolean z5 = true;
        long jIAuthTabCallback = 0;
        long j = 0;
        loop0: while (i2 < length) {
            if (!z5 && z3) {
                while (i2 < str.length() && str.charAt(i2) == ' ') {
                    i2++;
                }
            }
            getAbortMessage getabortmessageOnWarmupCompleted = getAbortMessage.Companion.onWarmupCompleted();
            int i3 = (getabortmessageOnWarmupCompleted.onExtraCallbackWithResult && ((cCharAt = str.charAt(i2)) == '+' || cCharAt == '-')) ? i2 + 1 : i2;
            while (i3 < str.length() && str.charAt(i3) == '0') {
                i3++;
            }
            long j2 = 0;
            while (true) {
                if (i3 >= str.length()) {
                    z4 = z3;
                    break;
                }
                char cCharAt2 = str.charAt(i3);
                z4 = z3;
                if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    int i4 = cCharAt2 - '0';
                    if (j2 > getabortmessageOnWarmupCompleted.asInterface) {
                        break loop0;
                    }
                    long j3 = j;
                    if (j2 == getabortmessageOnWarmupCompleted.asInterface && i4 > getabortmessageOnWarmupCompleted.onExtraCallback) {
                        break loop0;
                    }
                    j2 = i4 + (j2 << 3) + (j2 << 1);
                    i3++;
                    z3 = z4;
                    j = j3;
                } else {
                    break;
                }
            }
            if (z2) {
                throw new IllegalArgumentException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            return setLogBuffers.Companion.onExtraCallback();
        }
        return setLogBuffers.onNavigationEvent(IAuthTabCallback(jIAuthTabCallback, setRevision.MILLISECONDS), IAuthTabCallback(j, setRevision.NANOSECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IAuthTabCallback(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : RangesKt___RangesKt.coerceIn(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    private static final long IAuthTabCallback(String str, int i, int i2, setRevision setrevision) {
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return getCurrentBacktraceOrBuilderList.onExtraCallback(Double.parseDouble(strSubstring) * IAuthTabCallback(setrevision));
    }

    private static final long onExtraCallback(long j, setRevision setrevision) {
        return getCurrentBacktraceOrBuilderList.onExtraCallback(j * onWarmupCompleted(setrevision));
    }

    private static final setRevision onWarmupCompleted(String str, int i) {
        char cCharAt = str.charAt(i);
        char cCharAt2 = i < StringsKt__StringsKt.getLastIndex(str) ? str.charAt(i + 1) : (char) 0;
        if (cCharAt == 'd') {
            return setRevision.DAYS;
        }
        if (cCharAt == 'h') {
            return setRevision.HOURS;
        }
        if (cCharAt == 's') {
            return setRevision.SECONDS;
        }
        if (cCharAt == 'u') {
            if (cCharAt2 == 's') {
                return setRevision.MICROSECONDS;
            }
            return null;
        }
        if (cCharAt == 'm') {
            return cCharAt2 == 's' ? setRevision.MILLISECONDS : setRevision.MINUTES;
        }
        if (cCharAt == 'n' && cCharAt2 == 's') {
            return setRevision.NANOSECONDS;
        }
        return null;
    }

    private static final setRevision onExtraCallback(String str, int i) {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'D') {
            return setRevision.DAYS;
        }
        if (cCharAt == 'H') {
            return setRevision.HOURS;
        }
        if (cCharAt == 'M') {
            return setRevision.MINUTES;
        }
        if (cCharAt != 'S') {
            return null;
        }
        return setRevision.SECONDS;
    }

    private static final double onWarmupCompleted(setRevision setrevision) {
        switch (IAuthTabCallback.onExtraCallback[setrevision.ordinal()]) {
            case 1:
                return 1.0E-12d;
            case 2:
                return 1.0E-15d;
            case 3:
                return 1.0E-9d;
            case 4:
                return 1.0E-6d;
            case 5:
                return 6.0E-5d;
            case 6:
                return 0.0036d;
            case 7:
                return 0.0864d;
            default:
                throw new IllegalStateException(("Unknown unit: " + setrevision).toString());
        }
    }

    private static final long IAuthTabCallback(setRevision setrevision) {
        int i = IAuthTabCallback.onExtraCallback[setrevision.ordinal()];
        if (i == 5) {
            return 60000000000L;
        }
        if (i == 6) {
            return 3600000000000L;
        }
        if (i == 7) {
            return 86400000000000L;
        }
        throw new IllegalStateException(("Invalid unit: " + setrevision + " for fallback fraction multiplier").toString());
    }

    private static final int onExtraCallback(setRevision setrevision) {
        int i = IAuthTabCallback.onExtraCallback[setrevision.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long access000(long j) {
        return j / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onTransact(long j) {
        return setLogBuffers.Companion.onExtraCallback(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IAuthTabCallbackStub(long j) {
        return setLogBuffers.Companion.onExtraCallback((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onExtraCallback(long j, int i) {
        return setLogBuffers.Companion.onExtraCallback((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long IAuthTabCallbackDefault(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return onTransact(j);
        }
        return IAuthTabCallbackStub(access000(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long asBinder(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return onTransact(IAuthTabCallback_Parcel(j));
        }
        return IAuthTabCallbackStub(RangesKt___RangesKt.coerceIn(j, -4611686018427387903L, 4611686018427387903L));
    }
}
