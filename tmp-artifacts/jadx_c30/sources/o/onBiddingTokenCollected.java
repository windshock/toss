package o;

import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jmrtd.lds.iso19794.IrisImageInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class onBiddingTokenCollected {
    protected static final onBiddingTokenCollected[] IAuthTabCallback;
    protected static final Map<String, onBiddingTokenCollected> onNavigationEvent = new HashMap(256);
    private final int[] IAuthTabCallbackStub;
    private int asBinder;
    private final int onExtraCallback;
    private final String onExtraCallbackWithResult;
    private int onWarmupCompleted;

    static {
        onBiddingTokenCollected[] onbiddingtokencollectedArr = new onBiddingTokenCollected[256];
        IAuthTabCallback = onbiddingtokencollectedArr;
        onbiddingtokencollectedArr[0] = new getBiddingToken(0, "nop");
        onbiddingtokencollectedArr[1] = new getBiddingToken(1, "aconst_null");
        onbiddingtokencollectedArr[2] = new getBiddingToken(2, "iconst_m1");
        onbiddingtokencollectedArr[3] = new getBiddingToken(3, "iconst_0");
        onbiddingtokencollectedArr[4] = new getBiddingToken(4, "iconst_1");
        onbiddingtokencollectedArr[5] = new getBiddingToken(5, "iconst_2");
        onbiddingtokencollectedArr[6] = new getBiddingToken(6, "iconst_3");
        onbiddingtokencollectedArr[7] = new getBiddingToken(7, "iconst_4");
        onbiddingtokencollectedArr[8] = new getBiddingToken(8, "iconst_5");
        onbiddingtokencollectedArr[9] = new getBiddingToken(9, "lconst_0");
        onbiddingtokencollectedArr[10] = new getBiddingToken(10, "lconst_1");
        onbiddingtokencollectedArr[11] = new getBiddingToken(11, "fconst_0");
        onbiddingtokencollectedArr[12] = new getBiddingToken(12, "fconst_1");
        onbiddingtokencollectedArr[13] = new getBiddingToken(13, "fconst_2");
        onbiddingtokencollectedArr[14] = new getBiddingToken(14, "dconst_0");
        onbiddingtokencollectedArr[15] = new getBiddingToken(15, "dconst_1");
        onbiddingtokencollectedArr[16] = new SDKTypeConfig(16, "bipush", new int[]{16, -1});
        onbiddingtokencollectedArr[17] = new addPAGInitCallback(17, "sipush", new int[]{17, -1, -1});
        onbiddingtokencollectedArr[18] = new setSdkDisable(18, "ldc", new int[]{18, -1});
        onbiddingtokencollectedArr[19] = new setSdkDisable(19, "ldc_w", new int[]{19, -1, -1}, true);
        onbiddingtokencollectedArr[20] = new supportMultiProcess(20, "ldc2_w", new int[]{20, -1, -1});
        onbiddingtokencollectedArr[21] = new getDebugLog(21, "iload", new int[]{21, -1});
        onbiddingtokencollectedArr[22] = new getDebugLog(22, "lload", new int[]{22, -1});
        onbiddingtokencollectedArr[23] = new getDebugLog(23, "fload", new int[]{23, -1});
        onbiddingtokencollectedArr[24] = new getDebugLog(24, "dload", new int[]{24, -1});
        onbiddingtokencollectedArr[25] = new getDebugLog(25, "aload", new int[]{25, -1});
        onbiddingtokencollectedArr[26] = new getBiddingToken(26, "iload_0");
        onbiddingtokencollectedArr[27] = new getBiddingToken(27, "iload_1");
        onbiddingtokencollectedArr[28] = new getBiddingToken(28, "iload_2");
        onbiddingtokencollectedArr[29] = new getBiddingToken(29, "iload_3");
        onbiddingtokencollectedArr[30] = new getBiddingToken(30, "lload_0");
        onbiddingtokencollectedArr[31] = new getBiddingToken(31, "lload_1");
        onbiddingtokencollectedArr[32] = new getBiddingToken(32, "lload_2");
        onbiddingtokencollectedArr[33] = new getBiddingToken(33, "lload_3");
        onbiddingtokencollectedArr[34] = new getBiddingToken(34, "fload_0");
        onbiddingtokencollectedArr[35] = new getBiddingToken(35, "fload_1");
        onbiddingtokencollectedArr[36] = new getBiddingToken(36, "fload_2");
        onbiddingtokencollectedArr[37] = new getBiddingToken(37, "fload_3");
        onbiddingtokencollectedArr[38] = new getBiddingToken(38, "dload_0");
        onbiddingtokencollectedArr[39] = new getBiddingToken(39, "dload_1");
        onbiddingtokencollectedArr[40] = new getBiddingToken(40, "dload_2");
        onbiddingtokencollectedArr[41] = new getBiddingToken(41, "dload_3");
        onbiddingtokencollectedArr[42] = new getBiddingToken(42, "aload_0");
        onbiddingtokencollectedArr[43] = new getBiddingToken(43, "aload_1");
        onbiddingtokencollectedArr[44] = new getBiddingToken(44, "aload_2");
        onbiddingtokencollectedArr[45] = new getBiddingToken(45, "aload_3");
        onbiddingtokencollectedArr[46] = new getBiddingToken(46, "iaload");
        onbiddingtokencollectedArr[47] = new getBiddingToken(47, "laload");
        onbiddingtokencollectedArr[48] = new getBiddingToken(48, "faload");
        onbiddingtokencollectedArr[49] = new getBiddingToken(49, "daload");
        onbiddingtokencollectedArr[50] = new getBiddingToken(50, "aaload");
        onbiddingtokencollectedArr[51] = new getBiddingToken(51, "baload");
        onbiddingtokencollectedArr[52] = new getBiddingToken(52, "caload");
        onbiddingtokencollectedArr[53] = new getBiddingToken(53, "saload");
        onbiddingtokencollectedArr[54] = new getDebugLog(54, "istore", new int[]{54, -1});
        onbiddingtokencollectedArr[55] = new getDebugLog(55, "lstore", new int[]{55, -1});
        onbiddingtokencollectedArr[56] = new getDebugLog(56, "fstore", new int[]{56, -1});
        onbiddingtokencollectedArr[57] = new getDebugLog(57, "dstore", new int[]{57, -1});
        onbiddingtokencollectedArr[58] = new getDebugLog(58, "astore", new int[]{58, -1});
        onbiddingtokencollectedArr[59] = new getBiddingToken(59, "istore_0");
        onbiddingtokencollectedArr[60] = new getBiddingToken(60, "istore_1");
        onbiddingtokencollectedArr[61] = new getBiddingToken(61, "istore_2");
        onbiddingtokencollectedArr[62] = new getBiddingToken(62, "istore_3");
        onbiddingtokencollectedArr[63] = new getBiddingToken(63, "lstore_0");
        onbiddingtokencollectedArr[64] = new getBiddingToken(64, "lstore_1");
        onbiddingtokencollectedArr[65] = new getBiddingToken(65, "lstore_2");
        onbiddingtokencollectedArr[66] = new getBiddingToken(66, "lstore_3");
        onbiddingtokencollectedArr[67] = new getBiddingToken(67, "fstore_0");
        onbiddingtokencollectedArr[68] = new getBiddingToken(68, "fstore_1");
        onbiddingtokencollectedArr[69] = new getBiddingToken(69, "fstore_2");
        onbiddingtokencollectedArr[70] = new getBiddingToken(70, "fstore_3");
        onbiddingtokencollectedArr[71] = new getBiddingToken(71, "dstore_0");
        onbiddingtokencollectedArr[72] = new getBiddingToken(72, "dstore_1");
        onbiddingtokencollectedArr[73] = new getBiddingToken(73, "dstore_2");
        onbiddingtokencollectedArr[74] = new getBiddingToken(74, "dstore_3");
        onbiddingtokencollectedArr[75] = new getBiddingToken(75, "astore_0");
        onbiddingtokencollectedArr[76] = new getBiddingToken(76, "astore_1");
        onbiddingtokencollectedArr[77] = new getBiddingToken(77, "astore_2");
        onbiddingtokencollectedArr[78] = new getBiddingToken(78, "astore_3");
        onbiddingtokencollectedArr[79] = new getBiddingToken(79, "iastore");
        onbiddingtokencollectedArr[80] = new getBiddingToken(80, "lastore");
        onbiddingtokencollectedArr[81] = new getBiddingToken(81, "fastore");
        onbiddingtokencollectedArr[82] = new getBiddingToken(82, "dastore");
        onbiddingtokencollectedArr[83] = new getBiddingToken(83, "aastore");
        onbiddingtokencollectedArr[84] = new getBiddingToken(84, "bastore");
        onbiddingtokencollectedArr[85] = new getBiddingToken(85, "castore");
        onbiddingtokencollectedArr[86] = new getBiddingToken(86, "sastore");
        onbiddingtokencollectedArr[87] = new getBiddingToken(87, "pop");
        onbiddingtokencollectedArr[88] = new getBiddingToken(88, "pop2");
        onbiddingtokencollectedArr[89] = new getBiddingToken(89, "dup");
        onbiddingtokencollectedArr[90] = new getBiddingToken(90, "dup_x1");
        onbiddingtokencollectedArr[91] = new getBiddingToken(91, "dup_x2");
        onbiddingtokencollectedArr[92] = new getBiddingToken(92, "dup2");
        onbiddingtokencollectedArr[93] = new getBiddingToken(93, "dup2_x1");
        onbiddingtokencollectedArr[94] = new getBiddingToken(94, "dup2_x2");
        onbiddingtokencollectedArr[95] = new getBiddingToken(95, "swap");
        onbiddingtokencollectedArr[96] = new getBiddingToken(96, "iadd");
        onbiddingtokencollectedArr[97] = new getBiddingToken(97, "ladd");
        onbiddingtokencollectedArr[98] = new getBiddingToken(98, "fadd");
        onbiddingtokencollectedArr[99] = new getBiddingToken(99, "dadd");
        onbiddingtokencollectedArr[100] = new getBiddingToken(100, "isub");
        onbiddingtokencollectedArr[101] = new getBiddingToken(101, "lsub");
        onbiddingtokencollectedArr[102] = new getBiddingToken(102, "fsub");
        onbiddingtokencollectedArr[103] = new getBiddingToken(103, "dsub");
        onbiddingtokencollectedArr[104] = new getBiddingToken(104, "imul");
        onbiddingtokencollectedArr[105] = new getBiddingToken(105, "lmul");
        onbiddingtokencollectedArr[106] = new getBiddingToken(106, "fmul");
        onbiddingtokencollectedArr[107] = new getBiddingToken(107, "dmul");
        onbiddingtokencollectedArr[108] = new getBiddingToken(108, "idiv");
        onbiddingtokencollectedArr[109] = new getBiddingToken(109, "ldiv");
        onbiddingtokencollectedArr[110] = new getBiddingToken(110, "fdiv");
        onbiddingtokencollectedArr[111] = new getBiddingToken(111, "ddiv");
        onbiddingtokencollectedArr[112] = new getBiddingToken(112, "irem");
        onbiddingtokencollectedArr[113] = new getBiddingToken(113, "lrem");
        onbiddingtokencollectedArr[114] = new getBiddingToken(114, "frem");
        onbiddingtokencollectedArr[115] = new getBiddingToken(115, "drem");
        onbiddingtokencollectedArr[116] = new getBiddingToken(116, BuildConfig.FLAVOR);
        onbiddingtokencollectedArr[117] = new getBiddingToken(117, "lneg");
        onbiddingtokencollectedArr[118] = new getBiddingToken(118, "fneg");
        onbiddingtokencollectedArr[119] = new getBiddingToken(119, "dneg");
        onbiddingtokencollectedArr[120] = new getBiddingToken(120, "ishl");
        onbiddingtokencollectedArr[121] = new getBiddingToken(121, "lshl");
        onbiddingtokencollectedArr[122] = new getBiddingToken(122, "ishr");
        onbiddingtokencollectedArr[123] = new getBiddingToken(123, "lshr");
        onbiddingtokencollectedArr[124] = new getBiddingToken(124, "iushr");
        onbiddingtokencollectedArr[125] = new getBiddingToken(125, "lushr");
        onbiddingtokencollectedArr[126] = new getBiddingToken(126, "iand");
        onbiddingtokencollectedArr[127] = new getBiddingToken(CertificateBody.profileType, "land");
        onbiddingtokencollectedArr[128] = new getBiddingToken(128, "ior");
        onbiddingtokencollectedArr[129] = new getBiddingToken(129, "lor");
        onbiddingtokencollectedArr[130] = new getBiddingToken(130, "ixor");
        onbiddingtokencollectedArr[131] = new getBiddingToken(131, "lxor");
        onbiddingtokencollectedArr[132] = new setPAConsent(132, "iinc", new int[]{132, -1, -1});
        onbiddingtokencollectedArr[133] = new getBiddingToken(ISO7816.TAG_SM_ENCRYPTED_DATA, "i2l");
        onbiddingtokencollectedArr[134] = new getBiddingToken(134, "i2f");
        onbiddingtokencollectedArr[135] = new getBiddingToken(ISO7816.TAG_SM_ENCRYPTED_DATA_WITH_PADDING_INDICATOR, "i2d");
        onbiddingtokencollectedArr[136] = new getBiddingToken(136, "l2i");
        onbiddingtokencollectedArr[137] = new getBiddingToken(137, "l2f");
        onbiddingtokencollectedArr[138] = new getBiddingToken(138, "l2d");
        onbiddingtokencollectedArr[139] = new getBiddingToken(139, "f2i");
        onbiddingtokencollectedArr[140] = new getBiddingToken(140, "f2l");
        onbiddingtokencollectedArr[141] = new getBiddingToken(141, "f2d");
        onbiddingtokencollectedArr[142] = new getBiddingToken(ISO7816.TAG_SM_CRYPTOGRAPHIC_CHECKSUM, "d2i");
        onbiddingtokencollectedArr[143] = new getBiddingToken(143, "d2l");
        onbiddingtokencollectedArr[144] = new getBiddingToken(144, "d2f");
        onbiddingtokencollectedArr[145] = new getBiddingToken(145, "i2b");
        onbiddingtokencollectedArr[146] = new getBiddingToken(146, "i2c");
        onbiddingtokencollectedArr[147] = new getBiddingToken(147, "i2s");
        onbiddingtokencollectedArr[148] = new getBiddingToken(148, "lcmp");
        onbiddingtokencollectedArr[149] = new getBiddingToken(149, "fcmpl");
        onbiddingtokencollectedArr[150] = new getBiddingToken(150, "fcmpg");
        onbiddingtokencollectedArr[151] = new getBiddingToken(ISO7816.TAG_SM_EXPECTED_LENGTH, "dcmpl");
        onbiddingtokencollectedArr[152] = new getBiddingToken(152, "dcmpg");
        onbiddingtokencollectedArr[153] = new setAppIconId(ISO7816.TAG_SM_STATUS_WORD, "ifeq", new int[]{ISO7816.TAG_SM_STATUS_WORD, -1, -1});
        onbiddingtokencollectedArr[154] = new setAppIconId(154, "ifne", new int[]{154, -1, -1});
        onbiddingtokencollectedArr[155] = new setAppIconId(155, "iflt", new int[]{155, -1, -1});
        onbiddingtokencollectedArr[156] = new setAppIconId(156, "ifge", new int[]{156, -1, -1});
        onbiddingtokencollectedArr[157] = new setAppIconId(157, "ifgt", new int[]{157, -1, -1});
        onbiddingtokencollectedArr[158] = new setAppIconId(158, "ifle", new int[]{158, -1, -1});
        onbiddingtokencollectedArr[159] = new setAppIconId(159, "if_icmpeq", new int[]{159, -1, -1});
        onbiddingtokencollectedArr[160] = new setAppIconId(160, "if_icmpne", new int[]{160, -1, -1});
        onbiddingtokencollectedArr[161] = new setAppIconId(161, "if_icmplt", new int[]{161, -1, -1});
        onbiddingtokencollectedArr[162] = new setAppIconId(162, "if_icmpge", new int[]{162, -1, -1});
        onbiddingtokencollectedArr[163] = new setAppIconId(163, "if_icmpgt", new int[]{163, -1, -1});
        onbiddingtokencollectedArr[164] = new setAppIconId(164, "if_icmple", new int[]{164, -1, -1});
        onbiddingtokencollectedArr[165] = new setAppIconId(165, "if_acmpeq", new int[]{165, -1, -1});
        onbiddingtokencollectedArr[166] = new setAppIconId(166, "if_acmpne", new int[]{166, -1, -1});
        onbiddingtokencollectedArr[167] = new setAppIconId(167, "goto", new int[]{167, -1, -1});
        onbiddingtokencollectedArr[168] = new setAppIconId(168, "jsr", new int[]{168, -1, -1});
        onbiddingtokencollectedArr[169] = new getDebugLog(169, "ret", new int[]{169, -1});
        onbiddingtokencollectedArr[170] = new PAGSdk3(170, "tableswitch");
        onbiddingtokencollectedArr[171] = new needClearTaskReset(171, "lookupswitch");
        onbiddingtokencollectedArr[172] = new getBiddingToken(172, "ireturn");
        onbiddingtokencollectedArr[173] = new getBiddingToken(173, "lreturn");
        onbiddingtokencollectedArr[174] = new getBiddingToken(174, "freturn");
        onbiddingtokencollectedArr[175] = new getBiddingToken(175, "dreturn");
        onbiddingtokencollectedArr[176] = new getBiddingToken(176, "areturn");
        onbiddingtokencollectedArr[177] = new getBiddingToken(177, "return");
        onbiddingtokencollectedArr[178] = new PAGBidError(178, "getstatic", new int[]{178, -1, -1});
        onbiddingtokencollectedArr[179] = new PAGBidError(179, "putstatic", new int[]{179, -1, -1});
        onbiddingtokencollectedArr[180] = new PAGBidError(180, "getfield", new int[]{180, -1, -1});
        onbiddingtokencollectedArr[181] = new PAGBidError(181, "putfield", new int[]{181, -1, -1});
        onbiddingtokencollectedArr[182] = new useTextureView(182, "invokevirtual", new int[]{182, -1, -1});
        onbiddingtokencollectedArr[183] = new useTextureView(183, "invokespecial", new int[]{183, -1, -1});
        onbiddingtokencollectedArr[184] = new useTextureView(184, "invokestatic", new int[]{184, -1, -1});
        onbiddingtokencollectedArr[185] = new onBiddingTokenFailed(185, "invokeinterface", new int[]{185, -1, -1, -1, 0});
        onbiddingtokencollectedArr[186] = new getBiddingToken(186, "xxxunusedxxx");
        onbiddingtokencollectedArr[187] = new getSDKVersion(187, "new", new int[]{187, -1, -1});
        onbiddingtokencollectedArr[188] = new SDKTypeConfig(188, "newarray", new int[]{188, -1});
        onbiddingtokencollectedArr[189] = new BiddingTokenCallback(189, "anewarray", new int[]{189, -1, -1});
        onbiddingtokencollectedArr[190] = new getBiddingToken(190, "arraylength");
        onbiddingtokencollectedArr[191] = new getBiddingToken(191, "athrow");
        onbiddingtokencollectedArr[192] = new BiddingTokenCallback(CertificateHolderAuthorization.CVCA, "checkcast", new int[]{CertificateHolderAuthorization.CVCA, -1, -1});
        onbiddingtokencollectedArr[193] = new BiddingTokenCallback(193, "instanceof", new int[]{193, -1, -1});
        onbiddingtokencollectedArr[194] = new getBiddingToken(194, "monitorenter");
        onbiddingtokencollectedArr[195] = new getBiddingToken(195, "monitorexit");
        onbiddingtokencollectedArr[196] = new PAGInterstitialAdInteractionListener(196, "wide");
        onbiddingtokencollectedArr[197] = new appIcon(197, "multianewarray", new int[]{197, -1, -1, -1});
        onbiddingtokencollectedArr[198] = new setAppIconId(198, "ifnull", new int[]{198, -1, -1});
        onbiddingtokencollectedArr[199] = new setAppIconId(199, "ifnonnull", new int[]{199, -1, -1});
        onbiddingtokencollectedArr[200] = new setAppIconId(200, "goto_w", new int[]{200, -1, -1, -1, -1}, true);
        onbiddingtokencollectedArr[201] = new setAppIconId(verifySignatureValue_NoAlgorithmInfo.REQUEST_ACCOUNT_VERIFICATION_WITH_TYPE, "jsr_w", new int[]{verifySignatureValue_NoAlgorithmInfo.REQUEST_ACCOUNT_VERIFICATION_WITH_TYPE, -1, -1, -1, -1}, true);
        onbiddingtokencollectedArr[202] = new PAGSdk21(verifySignatureValue_NoAlgorithmInfo.ACTIVITY_REQ_CODE_CHOOSE_ACCOUNT, "getstatic_this", new int[]{178, -1, -1});
        onbiddingtokencollectedArr[203] = new PAGSdk21(203, "putstatic_this", new int[]{179, -1, -1});
        onbiddingtokencollectedArr[204] = new PAGSdk21(204, "getfield_this", new int[]{180, -1, -1});
        onbiddingtokencollectedArr[205] = new PAGSdk21(205, "putfield_this", new int[]{181, -1, -1});
        onbiddingtokencollectedArr[206] = new PAGInterstitialAd(206, "invokevirtual_this", new int[]{182, -1, -1});
        onbiddingtokencollectedArr[207] = new PAGInterstitialAd(207, "invokespecial_this", new int[]{183, -1, -1});
        onbiddingtokencollectedArr[208] = new PAGInterstitialAd(208, "invokestatic_this", new int[]{184, -1, -1});
        onbiddingtokencollectedArr[209] = new PAGSdk21(209, "aload_0_getstatic_this", new int[]{42, 178, -1, -1});
        onbiddingtokencollectedArr[210] = new PAGSdk21(210, "aload_0_putstatic_this", new int[]{42, 179, -1, -1});
        onbiddingtokencollectedArr[211] = new PAGSdk21(Primes.SMALL_FACTOR_LIMIT, "aload_0_getfield_this", new int[]{42, 180, -1, -1});
        onbiddingtokencollectedArr[212] = new PAGSdk21(212, "aload_0_putfield_this", new int[]{42, 181, -1, -1});
        onbiddingtokencollectedArr[213] = new PAGInterstitialAd(213, "aload_0_invokevirtual_this", new int[]{42, 182, -1, -1});
        onbiddingtokencollectedArr[214] = new PAGInterstitialAd(214, "aload_0_invokespecial_this", new int[]{42, 183, -1, -1});
        onbiddingtokencollectedArr[215] = new PAGInterstitialAd(215, "aload_0_invokestatic_this", new int[]{42, 184, -1, -1});
        onbiddingtokencollectedArr[216] = new isInitSuccess(216, "getstatic_super", new int[]{178, -1, -1});
        onbiddingtokencollectedArr[217] = new isInitSuccess(217, "putstatic_super", new int[]{179, -1, -1});
        onbiddingtokencollectedArr[218] = new isInitSuccess(218, "getfield_super", new int[]{180, -1, -1});
        onbiddingtokencollectedArr[219] = new isInitSuccess(219, "putfield_super", new int[]{181, -1, -1});
        onbiddingtokencollectedArr[220] = new PAGSdk1(220, "invokevirtual_super", new int[]{182, -1, -1});
        onbiddingtokencollectedArr[221] = new PAGSdk1(221, "invokespecial_super", new int[]{183, -1, -1});
        onbiddingtokencollectedArr[222] = new PAGSdk1(222, "invokestatic_super", new int[]{184, -1, -1});
        onbiddingtokencollectedArr[223] = new isInitSuccess(223, "aload_0_getstatic_super", new int[]{42, 178, -1, -1});
        onbiddingtokencollectedArr[224] = new isInitSuccess(224, "aload_0_putstatic_super", new int[]{42, 179, -1, -1});
        onbiddingtokencollectedArr[225] = new isInitSuccess(225, "aload_0_getfield_super", new int[]{42, 180, -1, -1});
        onbiddingtokencollectedArr[226] = new isInitSuccess(226, "aload_0_putfield_super", new int[]{42, 181, -1, -1});
        onbiddingtokencollectedArr[227] = new PAGSdk1(227, "aload_0_invokevirtual_super", new int[]{42, 182, -1, -1});
        onbiddingtokencollectedArr[228] = new PAGSdk1(228, "aload_0_invokespecial_super", new int[]{42, 183, -1, -1});
        onbiddingtokencollectedArr[229] = new PAGSdk1(229, "aload_0_invokestatic_super", new int[]{42, 184, -1, -1});
        onbiddingtokencollectedArr[230] = new PAGSdkPAGInitCallback(230, "invokespecial_this_init", new int[]{183, -1, -1});
        onbiddingtokencollectedArr[231] = new setAdRevenue(231, "invokespecial_super_init", new int[]{183, -1, -1});
        onbiddingtokencollectedArr[232] = new PAGSdk(232, "invokespecial_new_init", new int[]{183, -1, -1});
        onbiddingtokencollectedArr[233] = new titleBarTheme(233, "cldc", new int[]{18, -1});
        onbiddingtokencollectedArr[234] = new PAGConfigBuilder(234, "ildc", new int[]{18, -1});
        onbiddingtokencollectedArr[235] = new debugLog(235, "fldc", new int[]{18, -1});
        onbiddingtokencollectedArr[236] = new titleBarTheme(236, "cldc_w", new int[]{19, -1, -1}, true);
        onbiddingtokencollectedArr[237] = new PAGConfigBuilder(237, "ildc_w", new int[]{19, -1, -1}, true);
        onbiddingtokencollectedArr[238] = new debugLog(238, "fldc_w", new int[]{19, -1, -1}, true);
        onbiddingtokencollectedArr[239] = new PAGBidCallback(239, "dldc2_w", new int[]{20, -1, -1});
        onbiddingtokencollectedArr[254] = new getBiddingToken(IrisImageInfo.IMAGE_QUAL_UNDEF, "impdep1");
        onbiddingtokencollectedArr[255] = new getBiddingToken(GF2Field.MASK, "impdep2");
        for (int i = 0; i < 256; i++) {
            onBiddingTokenCollected onbiddingtokencollected = onbiddingtokencollectedArr[i];
            if (onbiddingtokencollected != null) {
                onNavigationEvent.put(onbiddingtokencollected.onExtraCallbackWithResult(), onbiddingtokencollected);
            }
        }
    }

    public onBiddingTokenCollected(int i, String str) {
        this(i, str, new int[]{i});
    }

    public onBiddingTokenCollected(int i, String str, int[] iArr) {
        this.onExtraCallback = i;
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallbackStub = iArr;
        onWarmupCompleted();
    }

    protected void onWarmupCompleted() {
        int i = -1;
        this.onWarmupCompleted = -1;
        this.asBinder = -1;
        int length = 0;
        while (true) {
            int[] iArr = this.IAuthTabCallbackStub;
            if (length >= iArr.length) {
                break;
            }
            if (iArr[length] < 0) {
                this.onWarmupCompleted = length;
                length = iArr.length;
            } else {
                length++;
            }
        }
        int i2 = this.onWarmupCompleted;
        if (i2 == -1) {
            return;
        }
        while (true) {
            int[] iArr2 = this.IAuthTabCallbackStub;
            if (i2 >= iArr2.length) {
                break;
            }
            if (iArr2[i2] < 0) {
                i = i2;
            }
            i2++;
        }
        int i3 = i - this.onWarmupCompleted;
        if (i3 < 0) {
            throw new Error("Logic error: not finding rewrite operands correctly");
        }
        this.asBinder = i3 + 1;
    }

    public int onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public String onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public int[] IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    public int onNavigationEvent() {
        return this.asBinder;
    }

    public String toString() {
        return getClass().getName() + "(" + onExtraCallbackWithResult() + ")";
    }
}
