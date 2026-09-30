package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class AppLovinAd implements toMetersPerSecond {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final float onExtraCallback;
    private final float onWarmupCompleted;

    public AppLovinAd(float f, float f2) {
        this.onExtraCallback = f;
        this.onWarmupCompleted = f2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v7 int, still in use, count: 2, list:
          (r4v7 int) from 0x002e: INVOKE (r4v7 int) STATIC call: java.lang.Float.intBitsToFloat(int):float A[MD:(int):float (c), WRAPPED]
          (r4v7 int) from 0x0043: PHI (r4v3 int) = (r4v2 int), (r4v7 int) binds: [B:10:0x0040, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public o.rotate IAuthTabCallback(long r4, @org.jetbrains.annotations.NotNull o.ExtensionsManagerExtensionsAvailability r6, @org.jetbrains.annotations.NotNull o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r7) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AppLovinAd.onExtraCallbackWithResult
            int r1 = r1 + 91
            int r2 = r1 % 128
            o.AppLovinAd.onNavigationEvent = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            r6 = 32
            long r6 = r4 >> r6
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            r1 = 0
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 == 0) goto L5f
            int r7 = o.AppLovinAd.onExtraCallbackWithResult
            int r7 = r7 + 43
            int r2 = r7 % 128
            o.AppLovinAd.onNavigationEvent = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L39
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            r7 = 1073741824(0x40000000, float:2.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L43
            goto L5f
        L39:
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L43
            goto L5f
        L43:
            o.deprecated_noStore r5 = o.deprecated_noStore.onExtraCallback
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r7 = r3.onExtraCallback
            float r0 = r3.onWarmupCompleted
            android.graphics.Path r4 = r5.IAuthTabCallback(r6, r4, r7, r0)
            o.removeTimestamp r4 = o.getMappingAreaSize.onWarmupCompleted(r4)
            o.rotate$onExtraCallback r5 = new o.rotate$onExtraCallback
            r5.<init>(r4)
            return r5
        L5f:
            o.rotate$onExtraCallback r4 = new o.rotate$onExtraCallback
            o.removeTimestamp r5 = o.getMappingAreaSize.onWarmupCompleted()
            r4.<init>(r5)
            int r5 = o.AppLovinAd.onExtraCallbackWithResult
            int r5 = r5 + 43
            int r6 = r5 % 128
            o.AppLovinAd.onNavigationEvent = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L77
            r5 = 64
            int r5 = r5 / 0
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppLovinAd.IAuthTabCallback(long, o.ExtensionsManagerExtensionsAvailability, o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4):o.rotate");
    }
}
