package o;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class PlaceholderDataSourceExternalSyntheticLambda0 {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static final int IAuthTabCallbackStubProxy = 205;
    private static boolean IAuthTabCallback_Parcel;
    private static final byte[] access000;
    private static boolean access100;
    private static char[] asBinder;
    private static int asInterface;
    private static char[] getInterfaceDescriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static int[] onWarmupCompleted;

    static {
        byte[] bArr = {81, 99, 107, 124, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        access000 = bArr;
        onNavigationEvent();
        IAuthTabCallbackDefault = 0;
        asInterface = 1;
        IAuthTabCallback = 0;
        onTransact = 1;
        onExtraCallback = 0;
        onNavigationEvent = 1;
        onExtraCallback();
        onWarmupCompleted();
        ClassLoader parent = PlaceholderDataSourceExternalSyntheticLambda0.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr[0], String.class);
            declaredMethod.setAccessible(true);
            IAuthTabCallback((String) declaredMethod.invoke(parent, "ea56"));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        }
    }

    private static void b(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = asBinder;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (cArr2[i2] ^ 4582998195506282395L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (4582998195506282395L ^ IAuthTabCallbackStub);
        if (access100) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - i3);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallback_Parcel) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - i3);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - i3);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        objArr[0] = new String(cArr6);
    }

    private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ 2744549297567066702L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i2) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * 2) + 1) - c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * 2) - c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i6, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i2) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i2 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i2) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new int[]{1012055178, -499009637, 4019051, 215835821, 784862071, -591904217, -1206772316, 1333975983, 1339517850, 1154423504, 1470422682, -1204528111, -108765752, -2110049040, 1318810687, 409835004, 84755467, -733380962};
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = -837138575;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(10:818|356|812|357|358|802|359|272|842|626)|751|386|387|697|388|94e|401|843|626) */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x09b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x09b2, code lost:
    
        r16 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x09ab A[Catch: all -> 0x09ad, TryCatch #58 {, blocks: (B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:748:0x098c, outer: #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x09ac A[Catch: all -> 0x09ad, TRY_LEAVE, TryCatch #58 {, blocks: (B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:748:0x098c, outer: #60 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x09cb A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x09cc A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x09f3 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x09f4 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0a0b A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a0c A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a2b A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a2c A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a68 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a69 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a80 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a81 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0aa1 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0aa2 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0abc A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0abd A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0aea A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0aeb A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0b0f A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0b10 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0b34 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0b35 A[Catch: Exception -> 0x0b60, TryCatch #60 {Exception -> 0x0b60, blocks: (B:421:0x09af, B:422:0x09b0, B:435:0x09c4, B:437:0x09cb, B:438:0x09cc, B:443:0x09d2, B:445:0x09dc, B:446:0x09dd, B:454:0x09ec, B:456:0x09f3, B:457:0x09f4, B:465:0x0a04, B:467:0x0a0b, B:468:0x0a0c, B:482:0x0a24, B:484:0x0a2b, B:485:0x0a2c, B:493:0x0a3b, B:495:0x0a42, B:496:0x0a43, B:512:0x0a61, B:514:0x0a68, B:515:0x0a69, B:523:0x0a79, B:525:0x0a80, B:526:0x0a81, B:541:0x0a9a, B:543:0x0aa1, B:544:0x0aa2, B:555:0x0ab5, B:557:0x0abc, B:558:0x0abd, B:573:0x0ae3, B:575:0x0aea, B:576:0x0aeb, B:587:0x0b08, B:589:0x0b0f, B:590:0x0b10, B:601:0x0b2d, B:603:0x0b34, B:604:0x0b35, B:611:0x0b47, B:613:0x0b4f, B:614:0x0b50, B:616:0x0b52, B:618:0x0b5e, B:619:0x0b5f, B:13:0x0123, B:400:0x098c, B:402:0x098f, B:403:0x0994, B:415:0x09a4, B:417:0x09ab, B:418:0x09ac), top: B:669:0x0123, inners: #17, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028e A[Catch: Exception -> 0x0281, TRY_LEAVE, TryCatch #81 {Exception -> 0x0281, blocks: (B:42:0x01eb, B:48:0x0259, B:73:0x028e, B:82:0x02d4, B:84:0x02da, B:85:0x02db, B:87:0x02dd, B:89:0x02e4, B:90:0x02e5, B:52:0x0262, B:54:0x0269, B:55:0x026a, B:57:0x026c, B:59:0x0273, B:60:0x0274, B:62:0x0276, B:64:0x027d, B:65:0x027e, B:47:0x0232, B:45:0x021d, B:43:0x01ff, B:78:0x02a4, B:75:0x0296), top: B:788:0x01eb, inners: #24, #29, #36, #72, #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:775:0x078d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:839:0x0b79 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:844:0x0b6b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e6  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r14v88, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [char[], int[], java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v137 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void IAuthTabCallback(java.lang.String r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 3221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PlaceholderDataSourceExternalSyntheticLambda0.IAuthTabCallback(java.lang.String):void");
    }

    static void onNavigationEvent() {
        asBinder = new char[]{32460, 32271, 32274, 32256, 32263, 32490, 32269, 32279, 32278, 32315, 32492, 32277, 32486, 32487, 32501, 32462, 32507, 32261, 32266, 32461, 32257, 32259, 32262, 32273, 32272, 32268, 32484, 32265, 32270, 32276, 32481, 32483, 32267, 32502, 32314, 32498};
        IAuthTabCallbackStub = -1184334157;
        IAuthTabCallback_Parcel = true;
        access100 = true;
        getInterfaceDescriptor = new char[]{27340, 27462, 27463, 27461, 27487, 27487, 27462, 27463, 27484, 27261, 27176, 27170, 27157, 27155, 27192, 27170, 27170, 27336, 27456, 27463, 27469, 27319, 27317, 27464, 27461, 27460, 27460, 27480, 27252, 27170, 27176, 27176, 27178, 27172, 27197, 27196, 27199, 27170, 27157, 27256, 27172, 27177, 27166, 27160, 27175, 27179, 27164, 27137, 27257, 27157, 27152, 27170, 27176, 27172, 27177, 27181, 27173, 27197, 27181, 27181, 27194, 27196, 27161, 27360, 27389, 27369, 27369, 27388, 27255, 27197, 27188, 27190, 27189, 27185, 27342, 27184, 27175, 27168};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 102 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r0 = r6 + 11
            byte[] r1 = o.PlaceholderDataSourceExternalSyntheticLambda0.access000
            byte[] r0 = new byte[r0]
            int r6 = r6 + 10
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 2
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PlaceholderDataSourceExternalSyntheticLambda0.a(byte, short, byte, java.lang.Object[]):void");
    }
}
