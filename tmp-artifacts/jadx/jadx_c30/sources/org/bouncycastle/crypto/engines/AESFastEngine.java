package org.bouncycastle.crypto.engines;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class AESFastEngine implements BlockCipher {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int BLOCK_SIZE = 16;
    private static int IAuthTabCallback = 1;
    private static final byte[] S;
    private static final byte[] Si;
    private static final int[] T;
    private static final int[] Tinv;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent;
    private static int onWarmupCompleted;
    private static final int[] rcon;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    static {
        onWarmupCompleted();
        S = new byte[]{99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, 26, 27, 110, 90, ISOFileInfo.A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, ISO7816.INS_VERIFY, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, ISO7816.CLA_COMMAND_CHAINING, -1, -13, ISO7816.INS_WRITE_RECORD, -51, 12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, 23, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, 25, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, 31, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, ISO7816.INS_ERASE_BINARY, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, 30, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.A1, -119, 13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, 15, ISO7816.INS_READ_BINARY, 84, -69, 22};
        Si = new byte[]{82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, 11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, 21, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, 30, -113, ISO7816.INS_GET_DATA, 63, 15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, ISO7816.INS_ERASE_BINARY, -86, 24, -66, 27, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, ISO7816.INS_VERIFY, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, 18, ISO7816.CLA_COMMAND_CHAINING, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, 23, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, 20, 99, 85, 33, 12, 125};
        rcon = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, ISO7816.TAG_SM_EXPECTED_LENGTH, 53, 106, 212, 179, 125, 250, 239, 197, 145};
        int[] iArr = new int[1024];
        int[] iArr2 = new int[1024];
        ByteBuffer.wrap("¥ccÆ\u0084||ø\u0099wwî\u008d{{ö\ròòÿ½kkÖ±ooÞTÅÅ\u0091P00`\u0003\u0001\u0001\u0002©ggÎ}++V\u0019þþçb××µæ««M\u009avvìEÊÊ\u008f\u009d\u0082\u0082\u001f@ÉÉ\u0089\u0087}}ú\u0015úúïëYY²ÉGG\u008e\u000bððûì\u00ad\u00adAgÔÔ³ý¢¢_ê¯¯E¿\u009c\u009c#÷¤¤S\u0096rrä[ÀÀ\u009bÂ··u\u001cýýá®\u0093\u0093=j&&LZ66lA??~\u0002÷÷õOÌÌ\u0083\\44hô¥¥Q4ååÑ\bññù\u0093qqâsØØ«S11b?\u0015\u0015*\f\u0004\u0004\bRÇÇ\u0095e##F^ÃÃ\u009d(\u0018\u00180¡\u0096\u00967\u000f\u0005\u0005\nµ\u009a\u009a/\t\u0007\u0007\u000e6\u0012\u0012$\u009b\u0080\u0080\u001b=ââß&ëëÍi''NÍ²²\u007f\u009fuuê\u001b\t\t\u0012\u009e\u0083\u0083\u001dt,,X.\u001a\u001a4-\u001b\u001b6²nnÜîZZ´û  [öRR¤M;;vaÖÖ·Î³³}{))R>ããÝq//^\u0097\u0084\u0084\u0013õSS¦hÑÑ¹\u0000\u0000\u0000\u0000,ííÁ`  @\u001füüãÈ±±yí[[¶¾jjÔFËË\u008dÙ¾¾gK99rÞJJ\u0094ÔLL\u0098èXX°JÏÏ\u0085kÐÐ»*ïïÅåªªO\u0016ûûíÅCC\u0086×MM\u009aU33f\u0094\u0085\u0085\u0011ÏEE\u008a\u0010ùùé\u0006\u0002\u0002\u0004\u0081\u007f\u007fþðPP D<<xº\u009f\u009f%ã¨¨KóQQ¢þ££]À@@\u0080\u008a\u008f\u008f\u0005\u00ad\u0092\u0092?¼\u009d\u009d!H88p\u0004õõñß¼¼cÁ¶¶wuÚÚ¯c!!B0\u0010\u0010 \u001aÿÿå\u000eóóýmÒÒ¿LÍÍ\u0081\u0014\f\f\u00185\u0013\u0013&/ììÃá__¾¢\u0097\u00975ÌDD\u00889\u0017\u0017.WÄÄ\u0093ò§§U\u0082~~üG==z¬ddÈç]]º+\u0019\u00192\u0095ssæ ``À\u0098\u0081\u0081\u0019ÑOO\u009e\u007fÜÜ£f\"\"D~**T«\u0090\u0090;\u0083\u0088\u0088\u000bÊFF\u008c)îîÇÓ¸¸k<\u0014\u0014(yÞÞ§â^^¼\u001d\u000b\u000b\u0016vÛÛ\u00ad;ààÛV22dN::t\u001e\n\n\u0014ÛII\u0092\n\u0006\u0006\fl$$Hä\\\\¸]ÂÂ\u009fnÓÓ½ï¬¬C¦bbÄ¨\u0091\u00919¤\u0095\u009517ääÓ\u008byyò2ççÕCÈÈ\u008bY77n·mmÚ\u008c\u008d\u008d\u0001dÕÕ±ÒNN\u009cà©©I´llØúVV¬\u0007ôôó%êêÏ¯eeÊ\u008ezzôé®®G\u0018\b\b\u0010Õººo\u0088xxðo%%Jr..\\$\u001c\u001c8ñ¦¦WÇ´´sQÆÆ\u0097#èèË|ÝÝ¡\u009cttè!\u001f\u001f>ÝKK\u0096Ü½½a\u0086\u008b\u008b\r\u0085\u008a\u008a\u000f\u0090ppàB>>|ÄµµqªffÌØHH\u0090\u0005\u0003\u0003\u0006\u0001öö÷\u0012\u000e\u000e\u001c£aaÂ_55jùWW®Ð¹¹i\u0091\u0086\u0086\u0017XÁÁ\u0099'\u001d\u001d:¹\u009e\u009e'8ááÙ\u0013øøë³\u0098\u0098+3\u0011\u0011\"»iiÒpÙÙ©\u0089\u008e\u008e\u0007§\u0094\u00943¶\u009b\u009b-\"\u001e\u001e<\u0092\u0087\u0087\u0015 ééÉIÎÎ\u0087ÿUUªx((Pzßß¥\u008f\u008c\u008c\u0003ø¡¡Y\u0080\u0089\u0089\t\u0017\r\r\u001aÚ¿¿e1ææ×ÆBB\u0084¸hhÐÃAA\u0082°\u0099\u0099)w--Z\u0011\u000f\u000f\u001eË°°{üTT¨Ö»»m:\u0016\u0016,ccÆ¥||ø\u0084wwî\u0099{{ö\u008dòòÿ\rkkÖ½ooÞ±ÅÅ\u0091T00`P\u0001\u0001\u0002\u0003ggÎ©++V}þþç\u0019××µb««Mævvì\u009aÊÊ\u008fE\u0082\u0082\u001f\u009dÉÉ\u0089@}}ú\u0087úúï\u0015YY²ëGG\u008eÉððû\u000b\u00ad\u00adAìÔÔ³g¢¢_ý¯¯Eê\u009c\u009c#¿¤¤S÷rrä\u0096ÀÀ\u009b[··uÂýýá\u001c\u0093\u0093=®&&Lj66lZ??~A÷÷õ\u0002ÌÌ\u0083O44h\\¥¥QôååÑ4ññù\bqqâ\u0093ØØ«s11bS\u0015\u0015*?\u0004\u0004\b\fÇÇ\u0095R##FeÃÃ\u009d^\u0018\u00180(\u0096\u00967¡\u0005\u0005\n\u000f\u009a\u009a/µ\u0007\u0007\u000e\t\u0012\u0012$6\u0080\u0080\u001b\u009bââß=ëëÍ&''Ni²²\u007fÍuuê\u009f\t\t\u0012\u001b\u0083\u0083\u001d\u009e,,Xt\u001a\u001a4.\u001b\u001b6-nnÜ²ZZ´î  [ûRR¤ö;;vMÖÖ·a³³}Î))R{ããÝ>//^q\u0084\u0084\u0013\u0097SS¦õÑÑ¹h\u0000\u0000\u0000\u0000ííÁ,  @`üüã\u001f±±yÈ[[¶íjjÔ¾ËË\u008dF¾¾gÙ99rKJJ\u0094ÞLL\u0098ÔXX°èÏÏ\u0085JÐÐ»kïïÅ*ªªOåûûí\u0016CC\u0086ÅMM\u009a×33fU\u0085\u0085\u0011\u0094EE\u008aÏùùé\u0010\u0002\u0002\u0004\u0006\u007f\u007fþ\u0081PP ð<<xD\u009f\u009f%º¨¨KãQQ¢ó££]þ@@\u0080À\u008f\u008f\u0005\u008a\u0092\u0092?\u00ad\u009d\u009d!¼88pHõõñ\u0004¼¼cß¶¶wÁÚÚ¯u!!Bc\u0010\u0010 0ÿÿå\u001aóóý\u000eÒÒ¿mÍÍ\u0081L\f\f\u0018\u0014\u0013\u0013&5ììÃ/__¾á\u0097\u00975¢DD\u0088Ì\u0017\u0017.9ÄÄ\u0093W§§Uò~~ü\u0082==zGddÈ¬]]ºç\u0019\u00192+ssæ\u0095``À \u0081\u0081\u0019\u0098OO\u009eÑÜÜ£\u007f\"\"Df**T~\u0090\u0090;«\u0088\u0088\u000b\u0083FF\u008cÊîîÇ)¸¸kÓ\u0014\u0014(<ÞÞ§y^^¼â\u000b\u000b\u0016\u001dÛÛ\u00advààÛ;22dV::tN\n\n\u0014\u001eII\u0092Û\u0006\u0006\f\n$$Hl\\\\¸äÂÂ\u009f]ÓÓ½n¬¬CïbbÄ¦\u0091\u00919¨\u0095\u00951¤ääÓ7yyò\u008bççÕ2ÈÈ\u008bC77nYmmÚ·\u008d\u008d\u0001\u008cÕÕ±dNN\u009cÒ©©IàllØ´VV¬úôôó\u0007êêÏ%eeÊ¯zzô\u008e®®Gé\b\b\u0010\u0018ººoÕxxð\u0088%%Jo..\\r\u001c\u001c8$¦¦Wñ´´sÇÆÆ\u0097QèèË#ÝÝ¡|ttè\u009c\u001f\u001f>!KK\u0096Ý½½aÜ\u008b\u008b\r\u0086\u008a\u008a\u000f\u0085ppà\u0090>>|BµµqÄffÌªHH\u0090Ø\u0003\u0003\u0006\u0005öö÷\u0001\u000e\u000e\u001c\u0012aaÂ£55j_WW®ù¹¹iÐ\u0086\u0086\u0017\u0091ÁÁ\u0099X\u001d\u001d:'\u009e\u009e'¹ááÙ8øøë\u0013\u0098\u0098+³\u0011\u0011\"3iiÒ»ÙÙ©p\u008e\u008e\u0007\u0089\u0094\u00943§\u009b\u009b-¶\u001e\u001e<\"\u0087\u0087\u0015\u0092ééÉ ÎÎ\u0087IUUªÿ((Pxßß¥z\u008c\u008c\u0003\u008f¡¡Yø\u0089\u0089\t\u0080\r\r\u001a\u0017¿¿eÚææ×1BB\u0084ÆhhÐ¸AA\u0082Ã\u0099\u0099)°--Zw\u000f\u000f\u001e\u0011°°{ËTT¨ü»»mÖ\u0016\u0016,:cÆ¥c|ø\u0084|wî\u0099w{ö\u008d{òÿ\ròkÖ½koÞ±oÅ\u0091TÅ0`P0\u0001\u0002\u0003\u0001gÎ©g+V}+þç\u0019þ×µb×«Mæ«vì\u009avÊ\u008fEÊ\u0082\u001f\u009d\u0082É\u0089@É}ú\u0087}úï\u0015úY²ëYG\u008eÉGðû\u000bð\u00adAì\u00adÔ³gÔ¢_ý¢¯Eê¯\u009c#¿\u009c¤S÷¤rä\u0096rÀ\u009b[À·uÂ·ýá\u001cý\u0093=®\u0093&Lj&6lZ6?~A?÷õ\u0002÷Ì\u0083OÌ4h\\4¥Qô¥åÑ4åñù\bñqâ\u0093qØ«sØ1bS1\u0015*?\u0015\u0004\b\f\u0004Ç\u0095RÇ#Fe#Ã\u009d^Ã\u00180(\u0018\u00967¡\u0096\u0005\n\u000f\u0005\u009a/µ\u009a\u0007\u000e\t\u0007\u0012$6\u0012\u0080\u001b\u009b\u0080âß=âëÍ&ë'Ni'²\u007fÍ²uê\u009fu\t\u0012\u001b\t\u0083\u001d\u009e\u0083,Xt,\u001a4.\u001a\u001b6-\u001bnÜ²nZ´îZ [û R¤öR;vM;Ö·aÖ³}Î³)R{)ãÝ>ã/^q/\u0084\u0013\u0097\u0084S¦õSÑ¹hÑ\u0000\u0000\u0000\u0000íÁ,í @` üã\u001fü±yÈ±[¶í[jÔ¾jË\u008dFË¾gÙ¾9rK9J\u0094ÞJL\u0098ÔLX°èXÏ\u0085JÏÐ»kÐïÅ*ïªOåªûí\u0016ûC\u0086ÅCM\u009a×M3fU3\u0085\u0011\u0094\u0085E\u008aÏEùé\u0010ù\u0002\u0004\u0006\u0002\u007fþ\u0081\u007fP ðP<xD<\u009f%º\u009f¨Kã¨Q¢óQ£]þ£@\u0080À@\u008f\u0005\u008a\u008f\u0092?\u00ad\u0092\u009d!¼\u009d8pH8õñ\u0004õ¼cß¼¶wÁ¶Ú¯uÚ!Bc!\u0010 0\u0010ÿå\u001aÿóý\u000eóÒ¿mÒÍ\u0081LÍ\f\u0018\u0014\f\u0013&5\u0013ìÃ/ì_¾á_\u00975¢\u0097D\u0088ÌD\u0017.9\u0017Ä\u0093WÄ§Uò§~ü\u0082~=zG=dÈ¬d]ºç]\u00192+\u0019sæ\u0095s`À `\u0081\u0019\u0098\u0081O\u009eÑOÜ£\u007fÜ\"Df\"*T~*\u0090;«\u0090\u0088\u000b\u0083\u0088F\u008cÊFîÇ)î¸kÓ¸\u0014(<\u0014Þ§yÞ^¼â^\u000b\u0016\u001d\u000bÛ\u00advÛàÛ;à2dV2:tN:\n\u0014\u001e\nI\u0092ÛI\u0006\f\n\u0006$Hl$\\¸ä\\Â\u009f]ÂÓ½nÓ¬Cï¬bÄ¦b\u00919¨\u0091\u00951¤\u0095äÓ7äyò\u008byçÕ2çÈ\u008bCÈ7nY7mÚ·m\u008d\u0001\u008c\u008dÕ±dÕN\u009cÒN©Ià©lØ´lV¬úVôó\u0007ôêÏ%êeÊ¯ezô\u008ez®Gé®\b\u0010\u0018\bºoÕºxð\u0088x%Jo%.\\r.\u001c8$\u001c¦Wñ¦´sÇ´Æ\u0097QÆèË#èÝ¡|Ýtè\u009ct\u001f>!\u001fK\u0096ÝK½aÜ½\u008b\r\u0086\u008b\u008a\u000f\u0085\u008apà\u0090p>|B>µqÄµfÌªfH\u0090ØH\u0003\u0006\u0005\u0003ö÷\u0001ö\u000e\u001c\u0012\u000eaÂ£a5j_5W®ùW¹iÐ¹\u0086\u0017\u0091\u0086Á\u0099XÁ\u001d:'\u001d\u009e'¹\u009eáÙ8áøë\u0013ø\u0098+³\u0098\u0011\"3\u0011iÒ»iÙ©pÙ\u008e\u0007\u0089\u008e\u00943§\u0094\u009b-¶\u009b\u001e<\"\u001e\u0087\u0015\u0092\u0087éÉ éÎ\u0087IÎUªÿU(Px(ß¥zß\u008c\u0003\u008f\u008c¡Yø¡\u0089\t\u0080\u0089\r\u001a\u0017\r¿eÚ¿æ×1æB\u0084ÆBhÐ¸hA\u0082ÃA\u0099)°\u0099-Zw-\u000f\u001e\u0011\u000f°{Ë°T¨üT»mÖ»\u0016,:\u0016Æ¥ccø\u0084||î\u0099wwö\u008d{{ÿ\ròòÖ½kkÞ±oo\u0091TÅÅ`P00\u0002\u0003\u0001\u0001Î©ggV}++ç\u0019þþµb××Mæ««ì\u009avv\u008fEÊÊ\u001f\u009d\u0082\u0082\u0089@ÉÉú\u0087}}ï\u0015úú²ëYY\u008eÉGGû\u000bððAì\u00ad\u00ad³gÔÔ_ý¢¢Eê¯¯#¿\u009c\u009cS÷¤¤ä\u0096rr\u009b[ÀÀuÂ··á\u001cýý=®\u0093\u0093Lj&&lZ66~A??õ\u0002÷÷\u0083OÌÌh\\44Qô¥¥Ñ4ååù\bññâ\u0093qq«sØØbS11*?\u0015\u0015\b\f\u0004\u0004\u0095RÇÇFe##\u009d^ÃÃ0(\u0018\u00187¡\u0096\u0096\n\u000f\u0005\u0005/µ\u009a\u009a\u000e\t\u0007\u0007$6\u0012\u0012\u001b\u009b\u0080\u0080ß=ââÍ&ëëNi''\u007fÍ²²ê\u009fuu\u0012\u001b\t\t\u001d\u009e\u0083\u0083Xt,,4.\u001a\u001a6-\u001b\u001bÜ²nn´îZZ[û  ¤öRRvM;;·aÖÖ}Î³³R{))Ý>ãã^q//\u0013\u0097\u0084\u0084¦õSS¹hÑÑ\u0000\u0000\u0000\u0000Á,íí@`  ã\u001füüyÈ±±¶í[[Ô¾jj\u008dFËËgÙ¾¾rK99\u0094ÞJJ\u0098ÔLL°èXX\u0085JÏÏ»kÐÐÅ*ïïOåªªí\u0016ûû\u0086ÅCC\u009a×MMfU33\u0011\u0094\u0085\u0085\u008aÏEEé\u0010ùù\u0004\u0006\u0002\u0002þ\u0081\u007f\u007f ðPPxD<<%º\u009f\u009fKã¨¨¢óQQ]þ££\u0080À@@\u0005\u008a\u008f\u008f?\u00ad\u0092\u0092!¼\u009d\u009dpH88ñ\u0004õõcß¼¼wÁ¶¶¯uÚÚBc!! 0\u0010\u0010å\u001aÿÿý\u000eóó¿mÒÒ\u0081LÍÍ\u0018\u0014\f\f&5\u0013\u0013Ã/ìì¾á__5¢\u0097\u0097\u0088ÌDD.9\u0017\u0017\u0093WÄÄUò§§ü\u0082~~zG==È¬ddºç]]2+\u0019\u0019æ\u0095ssÀ ``\u0019\u0098\u0081\u0081\u009eÑOO£\u007fÜÜDf\"\"T~**;«\u0090\u0090\u000b\u0083\u0088\u0088\u008cÊFFÇ)îîkÓ¸¸(<\u0014\u0014§yÞÞ¼â^^\u0016\u001d\u000b\u000b\u00advÛÛÛ;ààdV22tN::\u0014\u001e\n\n\u0092ÛII\f\n\u0006\u0006Hl$$¸ä\\\\\u009f]ÂÂ½nÓÓCï¬¬Ä¦bb9¨\u0091\u00911¤\u0095\u0095Ó7ääò\u008byyÕ2çç\u008bCÈÈnY77Ú·mm\u0001\u008c\u008d\u008d±dÕÕ\u009cÒNNIà©©Ø´ll¬úVVó\u0007ôôÏ%êêÊ¯eeô\u008ezzGé®®\u0010\u0018\b\boÕººð\u0088xxJo%%\\r..8$\u001c\u001cWñ¦¦sÇ´´\u0097QÆÆË#èè¡|ÝÝè\u009ctt>!\u001f\u001f\u0096ÝKKaÜ½½\r\u0086\u008b\u008b\u000f\u0085\u008a\u008aà\u0090pp|B>>qÄµµÌªff\u0090ØHH\u0006\u0005\u0003\u0003÷\u0001öö\u001c\u0012\u000e\u000eÂ£aaj_55®ùWWiÐ¹¹\u0017\u0091\u0086\u0086\u0099XÁÁ:'\u001d\u001d'¹\u009e\u009eÙ8ááë\u0013øø+³\u0098\u0098\"3\u0011\u0011Ò»ii©pÙÙ\u0007\u0089\u008e\u008e3§\u0094\u0094-¶\u009b\u009b<\"\u001e\u001e\u0015\u0092\u0087\u0087É éé\u0087IÎÎªÿUUPx((¥zßß\u0003\u008f\u008c\u008cYø¡¡\t\u0080\u0089\u0089\u001a\u0017\r\reÚ¿¿×1ææ\u0084ÆBBÐ¸hh\u0082ÃAA)°\u0099\u0099Zw--\u001e\u0011\u000f\u000f{Ë°°¨üTTmÖ»»,:\u0016\u0016".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asIntBuffer().get(iArr2, 0, 1024);
        System.arraycopy(iArr2, 0, iArr, 0, 1024);
        T = iArr;
        int[] iArr3 = new int[1024];
        int[] iArr4 = new int[1024];
        ByteBuffer.wrap("P§ôQSeA~Ã¤\u0017\u001a\u0096^':Ëk«;ñE\u009d\u001f«Xú¬\u0093\u0003ãKUú0 ömv\u00ad\u0091vÌ\u0088%L\u0002õü×åO×Ë*Å\u0080D5&\u008f£bµIZ±Þg\u001bº%\u0098\u000eêEáÀþ]\u0002u/Ã\u0012ðL\u0081£\u0097F\u008dÆùÓkç_\u008f\u0003\u0095\u009c\u0092\u0015ëzm¿ÚYR\u0095-\u0083¾ÔÓ!tX)iàIDÈÉ\u008ej\u0089Âuxy\u008eôk>X\u0099Ýq¹'¶Oá¾\u0017\u00ad\u0088ðf¬ É´:Î}\u0018Jßc\u00821\u001aå`3Q\u0097E\u007fSbàwd±\u0084®k»\u001c \u0081þ\u0094+\bùXhHp\u0019ýE\u008f\u0087lÞ\u0094·ø{R#Ós«â\u0002KrW\u008f\u001fã*«Uf\u0007(ë²\u0003Âµ/\u009a{Å\u0086¥\b7Óò\u0087(0²¥¿#ºj\u0003\u0002\\\u0082\u0016í+\u001cÏ\u008a\u0092´y§ðò\u0007ó¡âiNÍôÚeÕ¾\u0005\u0006\u001fb4Ñ\u008aþ¦Ä\u009dS.4 Uó¢2á\u008a\u0005uëö¤9ì\u0083\u000bªï`@\u0006\u009fq^Q\u0010n½ù\u008a!>=\u0006Ý\u0096®\u0005>ÝF½æMµ\u008dT\u0091\u0005]ÄqoÔ\u0006\u0004ÿ\u0015P`$û\u0098\u0019\u0097é½ÖÌC@\u0089w\u009eÙg½Bè°\u0088\u008b\u0089\u00078[\u0019çÛîÈyG\n|¡é\u000fB|É\u001e\u0084ø\u0000\u0000\u0000\u0000\u0083\u0086\u0080\tHí+2¬p\u0011\u001eNrZlûÿ\u000eýV8\u0085\u000f\u001eÕ®='9-6dÙ\u000f\n!¦\\hÑT[\u009b:.6$±g\n\f\u000fçW\u0093Ò\u0096î´\u009e\u0091\u009b\u001bOÅÀ\u0080¢ ÜaiKwZ\u0016\u001a\u0012\u001c\nº\u0093âå* ÀCà\"<\u001d\u0017\u001b\u0012\u000b\r\t\u000e\u00adÇ\u008bò¹¨¶-È©\u001e\u0014\u0085\u0019ñWL\u0007u¯»Ý\u0099îý`\u007f£\u009f&\u0001÷¼õr\\Å;fD4~û[v)C\u008bÜÆ#Ëhüí¶cñä¸ÊÜ1×\u0010\u0085cB@\"\u0097\u0013 \u0011Æ\u0084}$J\u0085ø=»Ò\u00112ù®m¡)ÇK/\u009e\u001dó0²ÜìR\u0086\rÐãÁwl\u0016³+\u0099¹p©úH\u0094\u0011\"déGÄ\u008cü¨\u001a?ð Ø,}Vï\u00903\"ÇNI\u0087ÁÑ8Ùþ¢Ê\u008c6\u000bÔ\u0098Ï\u0081õ¦(Þz¥&\u008e·Ú¤¿\u00ad?ä\u009d:,\r\u0092xP\u009bÌ_jbF~TÂ\u0013\u008döè¸Ø\u0090^÷9.õ¯Ã\u0082¾\u0080]\u009f|\u0093Ði©-Õo³\u0012%Ï;\u0099¬È§}\u0018\u0010nc\u009cè{»;Û\tx&Íô\u0018Yn\u0001·\u009aì¨\u009aO\u0083en\u0095æ~æÿª\bÏ¼!æè\u0015ïÙ\u009bçºÎ6oJÔ\t\u009fêÖ|°)¯²¤11#?*0\u0094¥ÆÀf¢57¼Nt¦Ê\u0082ü°Ð\u0090à\u0015Ø§3J\u0098\u0004ñ÷ÚìA\u000ePÍ\u007f/ö\u0091\u0017\u008dÖMvM°ïCTMªÌß\u0004\u0096äãµÑ\u009e\u001b\u0088jL¸\u001f,Á\u007fQeF\u0004ê^\u009d]5\u008c\u0001st\u0087ú.A\u000bûZ\u001dg³RÒÛ\u00923V\u0010é\u0013GÖm\u008ca×\u009az\f¡7\u008e\u0014øY\u0089<\u0013ëî'©Î5Éa·íå\u001cá<±GzYßÒ\u009c?sòUyÎ\u0014\u0018¿7ÇsêÍ÷S[ªý_\u0014o=ß\u0086ÛDx\u0081ó¯Ê>Äh¹,4$8_@£ÂrÃ\u001d\u0016\f%â¼\u008bI<(A\u0095\rÿq\u0001¨9Þ³\f\b\u009cä´Ø\u0090ÁVda\u0084Ë{p¶2Õt\\lHBW¸Ð§ôQPeA~S¤\u0017\u001aÃ^':\u0096k«;ËE\u009d\u001fñXú¬«\u0003ãK\u0093ú0 Umv\u00adövÌ\u0088\u0091L\u0002õ%×åOüË*Å×D5&\u0080£bµ\u008fZ±ÞI\u001bº%g\u000eêE\u0098Àþ]áu/Ã\u0002ðL\u0081\u0012\u0097F\u008d£ùÓkÆ_\u008f\u0003ç\u009c\u0092\u0015\u0095zm¿ëYR\u0095Ú\u0083¾Ô-!tXÓiàI)ÈÉ\u008eD\u0089Âujy\u008eôx>X\u0099kq¹'ÝOá¾¶\u00ad\u0088ð\u0017¬ Éf:Î}´Jßc\u00181\u001aå\u00823Q\u0097`\u007fSbEwd±à®k»\u0084 \u0081þ\u001c+\bù\u0094hHpXýE\u008f\u0019lÞ\u0094\u0087ø{R·Ós«#\u0002Krâ\u008f\u001fãW«Uf*(ë²\u0007Âµ/\u0003{Å\u0086\u009a\b7Ó¥\u0087(0ò¥¿#²j\u0003\u0002º\u0082\u0016í\\\u001cÏ\u008a+´y§\u0092ò\u0007óðâiN¡ôÚeÍ¾\u0005\u0006Õb4Ñ\u001fþ¦Ä\u008aS.4\u009dUó¢ á\u008a\u00052ëö¤uì\u0083\u000b9ï`@ª\u009fq^\u0006\u0010n½Q\u008a!>ù\u0006Ý\u0096=\u0005>Ý®½æMF\u008dT\u0091µ]Äq\u0005Ô\u0006\u0004o\u0015P`ÿû\u0098\u0019$é½Ö\u0097C@\u0089Ì\u009eÙgwBè°½\u008b\u0089\u0007\u0088[\u0019ç8îÈyÛ\n|¡G\u000fB|é\u001e\u0084øÉ\u0000\u0000\u0000\u0000\u0086\u0080\t\u0083í+2Hp\u0011\u001e¬rZlNÿ\u000eýû8\u0085\u000fVÕ®=\u001e9-6'Ù\u000f\nd¦\\h!T[\u009bÑ.6$:g\n\f±çW\u0093\u000f\u0096î´Ò\u0091\u009b\u001b\u009eÅÀ\u0080O Üa¢KwZi\u001a\u0012\u001c\u0016º\u0093â\n* Àåà\"<C\u0017\u001b\u0012\u001d\r\t\u000e\u000bÇ\u008bò\u00ad¨¶-¹©\u001e\u0014È\u0019ñW\u0085\u0007u¯LÝ\u0099î»`\u007f£ý&\u0001÷\u009fõr\\¼;fDÅ~û[4)C\u008bvÆ#ËÜüí¶hñä¸cÜ1×Ê\u0085cB\u0010\"\u0097\u0013@\u0011Æ\u0084 $J\u0085}=»Òø2ù®\u0011¡)Çm/\u009e\u001dK0²ÜóR\u0086\rìãÁwÐ\u0016³+l¹p©\u0099H\u0094\u0011údéG\"\u008cü¨Ä?ð \u001a,}VØ\u00903\"ïNI\u0087ÇÑ8ÙÁ¢Ê\u008cþ\u000bÔ\u00986\u0081õ¦ÏÞz¥(\u008e·Ú&¿\u00ad?¤\u009d:,ä\u0092xP\rÌ_j\u009bF~Tb\u0013\u008döÂ¸Ø\u0090è÷9.^¯Ã\u0082õ\u0080]\u009f¾\u0093Ði|-Õo©\u0012%Ï³\u0099¬È;}\u0018\u0010§c\u009cèn»;Û{x&Í\t\u0018Ynô·\u009aì\u0001\u009aO\u0083¨n\u0095æeæÿª~Ï¼!\bè\u0015ïæ\u009bçºÙ6oJÎ\t\u009fêÔ|°)Ö²¤1¯#?*1\u0094¥Æ0f¢5À¼Nt7Ê\u0082ü¦Ð\u0090à°Ø§3\u0015\u0098\u0004ñJÚìA÷PÍ\u007f\u000eö\u0091\u0017/ÖMv\u008d°ïCMMªÌT\u0004\u0096äßµÑ\u009eã\u0088jL\u001b\u001f,Á¸QeF\u007fê^\u009d\u00045\u008c\u0001]t\u0087úsA\u000bû.\u001dg³ZÒÛ\u0092RV\u0010é3GÖm\u0013a×\u009a\u008c\f¡7z\u0014øY\u008e<\u0013ë\u0089'©ÎîÉa·5å\u001cáí±Gz<ßÒ\u009cYsòU?Î\u0014\u0018y7Çs¿Í÷Sêªý_[o=ß\u0014ÛDx\u0086ó¯Ê\u0081Äh¹>4$8,@£Â_Ã\u001d\u0016r%â¼\fI<(\u008b\u0095\rÿA\u0001¨9q³\f\bÞä´Ø\u009cÁVd\u0090\u0084Ë{a¶2Õp\\lHtW¸ÐBôQP§A~Se\u0017\u001aÃ¤':\u0096^«;Ëk\u009d\u001fñEú¬«XãK\u0093\u00030 Uúv\u00adömÌ\u0088\u0091v\u0002õ%LåOü×*Å×Ë5&\u0080Dbµ\u008f£±ÞIZº%g\u001bêE\u0098\u000eþ]áÀ/Ã\u0002uL\u0081\u0012ðF\u008d£\u0097ÓkÆù\u008f\u0003ç_\u0092\u0015\u0095\u009cm¿ëzR\u0095ÚY¾Ô-\u0083tXÓ!àI)iÉ\u008eDÈÂuj\u0089\u008eôxyX\u0099k>¹'Ýqá¾¶O\u0088ð\u0017\u00ad Éf¬Î}´:ßc\u0018J\u001aå\u00821Q\u0097`3SbE\u007fd±àwk»\u0084®\u0081þ\u001c \bù\u0094+HpXhE\u008f\u0019ýÞ\u0094\u0087l{R·øs«#ÓKrâ\u0002\u001fãW\u008fUf*«ë²\u0007(µ/\u0003ÂÅ\u0086\u009a{7Ó¥\b(0ò\u0087¿#²¥\u0003\u0002ºj\u0016í\\\u0082Ï\u008a+\u001cy§\u0092´\u0007óðòiN¡âÚeÍô\u0005\u0006Õ¾4Ñ\u001fb¦Ä\u008aþ.4\u009dSó¢ U\u008a\u00052áö¤uë\u0083\u000b9ì`@ªïq^\u0006\u009fn½Q\u0010!>ù\u008aÝ\u0096=\u0006>Ý®\u0005æMF½T\u0091µ\u008dÄq\u0005]\u0006\u0004oÔP`ÿ\u0015\u0098\u0019$û½Ö\u0097é@\u0089ÌCÙgw\u009eè°½B\u0089\u0007\u0088\u008b\u0019ç8[ÈyÛî|¡G\nB|é\u000f\u0084øÉ\u001e\u0000\u0000\u0000\u0000\u0080\t\u0083\u0086+2Hí\u0011\u001e¬pZlNr\u000eýûÿ\u0085\u000fV8®=\u001eÕ-6'9\u000f\ndÙ\\h!¦[\u009bÑT6$:.\n\f±gW\u0093\u000fçî´Ò\u0096\u009b\u001b\u009e\u0091À\u0080OÅÜa¢ wZiK\u0012\u001c\u0016\u001a\u0093â\nº Àå*\"<Cà\u001b\u0012\u001d\u0017\t\u000e\u000b\r\u008bò\u00adÇ¶-¹¨\u001e\u0014È©ñW\u0085\u0019u¯L\u0007\u0099î»Ý\u007f£ý`\u0001÷\u009f&r\\¼õfDÅ;û[4~C\u008bv)#ËÜÆí¶hüä¸cñ1×ÊÜcB\u0010\u0085\u0097\u0013@\"Æ\u0084 \u0011J\u0085}$»Òø=ù®\u00112)Çm¡\u009e\u001dK/²Üó0\u0086\rìRÁwÐã³+l\u0016p©\u0099¹\u0094\u0011úHéG\"dü¨Ä\u008cð \u001a?}VØ,3\"ï\u0090I\u0087ÇN8ÙÁÑÊ\u008cþ¢Ô\u00986\u000bõ¦Ï\u0081z¥(Þ·Ú&\u008e\u00ad?¤¿:,ä\u009dxP\r\u0092_j\u009bÌ~TbF\u008döÂ\u0013Ø\u0090è¸9.^÷Ã\u0082õ¯]\u009f¾\u0080Ði|\u0093Õo©-%Ï³\u0012¬È;\u0099\u0018\u0010§}\u009cènc;Û{»&Í\txYnô\u0018\u009aì\u0001·O\u0083¨\u009a\u0095æenÿª~æ¼!\bÏ\u0015ïæèçºÙ\u009boJÎ6\u009fêÔ\t°)Ö|¤1¯²?*1#¥Æ0\u0094¢5ÀfNt7¼\u0082ü¦Ê\u0090à°Ð§3\u0015Ø\u0004ñJ\u0098ìA÷ÚÍ\u007f\u000eP\u0091\u0017/öMv\u008dÖïCM°ªÌTM\u0096äß\u0004Ñ\u009eãµjL\u001b\u0088,Á¸\u001feF\u007fQ^\u009d\u0004ê\u008c\u0001]5\u0087úst\u000bû.Ag³Z\u001dÛ\u0092RÒ\u0010é3VÖm\u0013G×\u009a\u008ca¡7z\føY\u008e\u0014\u0013ë\u0089<©Îî'a·5É\u001cáíåGz<±Ò\u009cYßòU?s\u0014\u0018yÎÇs¿7÷SêÍý_[ª=ß\u0014oDx\u0086Û¯Ê\u0081óh¹>Ä$8,4£Â_@\u001d\u0016rÃâ¼\f%<(\u008bI\rÿA\u0095¨9q\u0001\f\bÞ³´Ø\u009cäVd\u0090ÁË{a\u00842Õp¶lHt\\¸ÐBWQP§ô~SeA\u001aÃ¤\u0017:\u0096^';Ëk«\u001fñE\u009d¬«XúK\u0093\u0003ã Uú0\u00adömv\u0088\u0091vÌõ%L\u0002Oü×åÅ×Ë*&\u0080D5µ\u008f£bÞIZ±%g\u001bºE\u0098\u000eê]áÀþÃ\u0002u/\u0081\u0012ðL\u008d£\u0097FkÆùÓ\u0003ç_\u008f\u0015\u0095\u009c\u0092¿ëzm\u0095ÚYRÔ-\u0083¾XÓ!tI)ià\u008eDÈÉuj\u0089Âôxy\u008e\u0099k>X'Ýq¹¾¶Oáð\u0017\u00ad\u0088Éf¬ }´:Îc\u0018Jßå\u00821\u001a\u0097`3QbE\u007fS±àwd»\u0084®kþ\u001c \u0081ù\u0094+\bpXhH\u008f\u0019ýE\u0094\u0087lÞR·ø{«#Ósrâ\u0002KãW\u008f\u001ff*«U²\u0007(ë/\u0003Âµ\u0086\u009a{ÅÓ¥\b70ò\u0087(#²¥¿\u0002ºj\u0003í\\\u0082\u0016\u008a+\u001cÏ§\u0092´yóðò\u0007N¡âieÍôÚ\u0006Õ¾\u0005Ñ\u001fb4Ä\u008aþ¦4\u009dS.¢ Uó\u00052á\u008a¤uëö\u000b9ì\u0083@ªï`^\u0006\u009fq½Q\u0010n>ù\u008a!\u0096=\u0006ÝÝ®\u0005>MF½æ\u0091µ\u008dTq\u0005]Ä\u0004oÔ\u0006`ÿ\u0015P\u0019$û\u0098Ö\u0097é½\u0089ÌC@gw\u009eÙ°½Bè\u0007\u0088\u008b\u0089ç8[\u0019yÛîÈ¡G\n||é\u000fBøÉ\u001e\u0084\u0000\u0000\u0000\u0000\t\u0083\u0086\u00802Hí+\u001e¬p\u0011lNrZýûÿ\u000e\u000fV8\u0085=\u001eÕ®6'9-\ndÙ\u000fh!¦\\\u009bÑT[$:.6\f±g\n\u0093\u000fçW´Ò\u0096î\u001b\u009e\u0091\u009b\u0080OÅÀa¢ ÜZiKw\u001c\u0016\u001a\u0012â\nº\u0093Àå* <Cà\"\u0012\u001d\u0017\u001b\u000e\u000b\r\tò\u00adÇ\u008b-¹¨¶\u0014È©\u001eW\u0085\u0019ñ¯L\u0007uî»Ý\u0099£ý`\u007f÷\u009f&\u0001\\¼õrDÅ;f[4~û\u008bv)CËÜÆ#¶hüí¸cñä×ÊÜ1B\u0010\u0085c\u0013@\"\u0097\u0084 \u0011Æ\u0085}$JÒø=»®\u00112ùÇm¡)\u001dK/\u009eÜó0²\rìR\u0086wÐãÁ+l\u0016³©\u0099¹p\u0011úH\u0094G\"dé¨Ä\u008cü \u001a?ðVØ,}\"ï\u00903\u0087ÇNIÙÁÑ8\u008cþ¢Ê\u00986\u000bÔ¦Ï\u0081õ¥(ÞzÚ&\u008e·?¤¿\u00ad,ä\u009d:P\r\u0092xj\u009bÌ_TbF~öÂ\u0013\u008d\u0090è¸Ø.^÷9\u0082õ¯Ã\u009f¾\u0080]i|\u0093Ðo©-ÕÏ³\u0012%È;\u0099¬\u0010§}\u0018ènc\u009cÛ{»;Í\tx&nô\u0018Yì\u0001·\u009a\u0083¨\u009aOæen\u0095ª~æÿ!\bÏ¼ïæè\u0015ºÙ\u009bçJÎ6oêÔ\t\u009f)Ö|°1¯²¤*1#?Æ0\u0094¥5Àf¢t7¼Nü¦Ê\u0082à°Ð\u00903\u0015Ø§ñJ\u0098\u0004A÷Úì\u007f\u000ePÍ\u0017/ö\u0091v\u008dÖMCM°ïÌTMªäß\u0004\u0096\u009eãµÑL\u001b\u0088jÁ¸\u001f,F\u007fQe\u009d\u0004ê^\u0001]5\u008cúst\u0087û.A\u000b³Z\u001dg\u0092RÒÛé3V\u0010m\u0013GÖ\u009a\u008ca×7z\f¡Y\u008e\u0014øë\u0089<\u0013Îî'©·5Éaáíå\u001cz<±G\u009cYßÒU?sò\u0018yÎ\u0014s¿7ÇSêÍ÷_[ªýß\u0014o=x\u0086ÛDÊ\u0081ó¯¹>Äh8,4$Â_@£\u0016rÃ\u001d¼\f%â(\u008bI<ÿA\u0095\r9q\u0001¨\bÞ³\fØ\u009cä´d\u0090ÁV{a\u0084ËÕp¶2Ht\\lÐBW¸".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asIntBuffer().get(iArr4, 0, 1024);
        System.arraycopy(iArr4, 0, iArr3, 0, 1024);
        Tinv = iArr3;
        int i = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static int FFmulX(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = (i & m1) >>> 9;
            i3 = (i & m2) + 1;
        } else {
            i2 = ((i & m1) >>> 7) * 27;
            i3 = (i & m2) << 1;
        }
        return i3 ^ i2;
    }

    private static int FFmulX2(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        int i6 = m4 & i;
        int i7 = i6 ^ (i6 >>> 1);
        int i8 = (((i & m5) << 2) ^ (i7 >>> 2)) ^ (i7 >>> 5);
        int i9 = i4 + 53;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    private void decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int i7 = this.ROUNDS;
        int[] iArr2 = iArr[i7];
        char c = 0;
        int i8 = iLittleEndianToInt ^ iArr2[0];
        int i9 = 1;
        int i10 = iLittleEndianToInt2 ^ iArr2[1];
        int i11 = iLittleEndianToInt3 ^ iArr2[2];
        int i12 = i7 - 1;
        int i13 = 3;
        int i14 = iLittleEndianToInt4 ^ iArr2[3];
        while (i12 > i9) {
            int i15 = IAuthTabCallback + i13;
            onExtraCallback = i15 % 128;
            int i16 = i15 % i3;
            int[] iArr3 = Tinv;
            int i17 = iArr3[i8 & GF2Field.MASK];
            int i18 = iArr3[((i14 >>> 8) & GF2Field.MASK) + 256];
            int i19 = iArr3[((i11 >>> 16) & GF2Field.MASK) + 512];
            int i20 = iArr3[(i10 >>> 24) + 768];
            int[] iArr4 = iArr[i12];
            int i21 = (i20 ^ ((i17 ^ i18) ^ i19)) ^ iArr4[c];
            int i22 = (iArr3[(i11 >>> 24) + 768] ^ ((iArr3[i10 & GF2Field.MASK] ^ iArr3[((i8 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i14 >>> 16) & GF2Field.MASK) + 512])) ^ iArr4[i9];
            int i23 = (((iArr3[i11 & GF2Field.MASK] ^ iArr3[((i10 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i8 >>> 16) & GF2Field.MASK) + 512]) ^ iArr3[(i14 >>> 24) + 768]) ^ iArr4[i3];
            int i24 = (((iArr3[i14 & GF2Field.MASK] ^ iArr3[((i11 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i10 >>> 16) & GF2Field.MASK) + 512]) ^ iArr3[(i8 >>> 24) + 768]) ^ iArr4[3];
            int i25 = iArr3[i21 & GF2Field.MASK];
            int i26 = iArr3[((i24 >>> 8) & GF2Field.MASK) + 256];
            int i27 = iArr3[((i23 >>> 16) & GF2Field.MASK) + 512];
            int i28 = iArr3[(i22 >>> 24) + 768];
            int[] iArr5 = iArr[i12 - 1];
            int i29 = iArr5[0];
            int i30 = iArr3[i22 & GF2Field.MASK];
            int i31 = iArr3[((i21 >>> 8) & GF2Field.MASK) + 256];
            int i32 = iArr3[((i24 >>> 16) & GF2Field.MASK) + 512];
            int i33 = iArr3[(i23 >>> 24) + 768];
            int i34 = iArr5[1];
            int i35 = iArr3[i23 & GF2Field.MASK];
            int i36 = iArr3[((i22 >>> 8) & GF2Field.MASK) + 256];
            int i37 = iArr3[((i21 >>> 16) & GF2Field.MASK) + 512];
            int i38 = iArr3[(i24 >>> 24) + 768];
            int i39 = iArr5[2];
            i12 -= 2;
            i14 = (((iArr3[i24 & GF2Field.MASK] ^ iArr3[((i23 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i22 >>> 16) & GF2Field.MASK) + 512]) ^ iArr3[(i21 >>> 24) + 768]) ^ iArr5[3];
            i8 = (((i25 ^ i26) ^ i27) ^ i28) ^ i29;
            i10 = (i33 ^ ((i30 ^ i31) ^ i32)) ^ i34;
            i11 = (((i36 ^ i35) ^ i37) ^ i38) ^ i39;
            i3 = 2;
            c = 0;
            i9 = 1;
            i13 = 3;
        }
        int[] iArr6 = Tinv;
        int i40 = iArr6[i8 & GF2Field.MASK];
        int i41 = iArr6[((i14 >>> 8) & GF2Field.MASK) + 256];
        int i42 = iArr6[((i11 >>> 16) & GF2Field.MASK) + 512];
        int i43 = iArr6[(i10 >>> 24) + 768];
        int[] iArr7 = iArr[1];
        int i44 = (((i40 ^ i41) ^ i42) ^ i43) ^ iArr7[0];
        int i45 = (((iArr6[i10 & GF2Field.MASK] ^ iArr6[((i8 >>> 8) & GF2Field.MASK) + 256]) ^ iArr6[((i14 >>> 16) & GF2Field.MASK) + 512]) ^ iArr6[(i11 >>> 24) + 768]) ^ iArr7[1];
        int i46 = (((iArr6[i11 & GF2Field.MASK] ^ iArr6[((i10 >>> 8) & GF2Field.MASK) + 256]) ^ iArr6[((i8 >>> 16) & GF2Field.MASK) + 512]) ^ iArr6[(i14 >>> 24) + 768]) ^ iArr7[2];
        int i47 = (((iArr6[i14 & GF2Field.MASK] ^ iArr6[((i11 >>> 8) & GF2Field.MASK) + 256]) ^ iArr6[((i10 >>> 16) & GF2Field.MASK) + 512]) ^ iArr6[(i8 >>> 24) + 768]) ^ iArr7[3];
        byte[] bArr3 = Si;
        byte b = bArr3[i44 & GF2Field.MASK];
        byte b2 = bArr3[(i47 >>> 8) & GF2Field.MASK];
        byte b3 = bArr3[(i46 >>> 16) & GF2Field.MASK];
        byte b4 = bArr3[i45 >>> 24];
        int[] iArr8 = iArr[0];
        int i48 = iArr8[0];
        byte b5 = bArr3[i45 & GF2Field.MASK];
        byte b6 = bArr3[(i44 >>> 8) & GF2Field.MASK];
        byte b7 = bArr3[(i47 >>> 16) & GF2Field.MASK];
        byte b8 = bArr3[i46 >>> 24];
        int i49 = iArr8[1];
        byte b9 = bArr3[i46 & GF2Field.MASK];
        byte b10 = bArr3[(i45 >>> 8) & GF2Field.MASK];
        byte b11 = bArr3[(i44 >>> 16) & GF2Field.MASK];
        byte b12 = bArr3[i47 >>> 24];
        int i50 = iArr8[2];
        byte b13 = bArr3[i47 & GF2Field.MASK];
        byte b14 = bArr3[(i46 >>> 8) & GF2Field.MASK];
        byte b15 = bArr3[(i45 >>> 16) & GF2Field.MASK];
        byte b16 = bArr3[i44 >>> 24];
        int i51 = iArr8[3];
        Pack.intToLittleEndian(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ ((b4 & 255) << 24)) ^ i48, bArr2, i2);
        Pack.intToLittleEndian((((((b6 & 255) << 8) ^ (b5 & 255)) ^ ((b7 & 255) << 16)) ^ ((b8 & 255) << 24)) ^ i49, bArr2, i2 + 4);
        Pack.intToLittleEndian((((((b10 & 255) << 8) ^ (b9 & 255)) ^ ((b11 & 255) << 16)) ^ ((b12 & 255) << 24)) ^ i50, bArr2, i2 + 8);
        Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ ((b16 & 255) << 24)) ^ i51, bArr2, i2 + 12);
        int i52 = onExtraCallback + 9;
        IAuthTabCallback = i52 % 128;
        if (i52 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2, int[][] iArr) {
        char c = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        char c2 = 0;
        int[] iArr2 = iArr[0];
        int i6 = iLittleEndianToInt ^ iArr2[0];
        int i7 = iLittleEndianToInt2 ^ iArr2[1];
        int i8 = iLittleEndianToInt3 ^ iArr2[2];
        int i9 = iLittleEndianToInt4 ^ iArr2[3];
        AESFastEngine aESFastEngine = this;
        int i10 = 1;
        for (int i11 = 1; i10 < aESFastEngine.ROUNDS - i11; i11 = 1) {
            int[] iArr3 = T;
            int i12 = iArr3[i6 & GF2Field.MASK];
            int i13 = iArr3[((i7 >>> 8) & GF2Field.MASK) + 256];
            int i14 = iArr3[((i8 >>> 16) & GF2Field.MASK) + 512];
            int i15 = iArr3[(i9 >>> 24) + 768];
            int[] iArr4 = iArr[i10];
            int i16 = (i15 ^ ((i12 ^ i13) ^ i14)) ^ iArr4[c2];
            int i17 = (iArr3[(i6 >>> 24) + 768] ^ ((iArr3[i7 & GF2Field.MASK] ^ iArr3[((i8 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i9 >>> 16) & GF2Field.MASK) + 512])) ^ iArr4[i11];
            int i18 = (((iArr3[i8 & GF2Field.MASK] ^ iArr3[((i9 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i6 >>> 16) & GF2Field.MASK) + 512]) ^ iArr3[(i7 >>> 24) + 768]) ^ iArr4[c];
            int i19 = (((iArr3[i9 & GF2Field.MASK] ^ iArr3[((i6 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i7 >>> 16) & GF2Field.MASK) + 512]) ^ iArr3[(i8 >>> 24) + 768]) ^ iArr4[3];
            int i20 = iArr3[i16 & GF2Field.MASK];
            int i21 = iArr3[((i17 >>> 8) & GF2Field.MASK) + 256];
            int i22 = iArr3[((i18 >>> 16) & GF2Field.MASK) + 512];
            int i23 = iArr3[(i19 >>> 24) + 768];
            int[] iArr5 = iArr[i10 + 1];
            int i24 = iArr5[0];
            int i25 = iArr3[i17 & GF2Field.MASK];
            int i26 = iArr3[((i18 >>> 8) & GF2Field.MASK) + 256];
            int i27 = iArr3[((i19 >>> 16) & GF2Field.MASK) + 512];
            int i28 = iArr3[(i16 >>> 24) + 768];
            int i29 = iArr5[1];
            int i30 = iArr3[i18 & GF2Field.MASK];
            int i31 = iArr3[((i19 >>> 8) & GF2Field.MASK) + 256];
            int i32 = iArr3[((i16 >>> 16) & GF2Field.MASK) + 512];
            int i33 = iArr3[(i17 >>> 24) + 768];
            int i34 = iArr5[2];
            i10 += 2;
            i9 = (((iArr3[i19 & GF2Field.MASK] ^ iArr3[((i16 >>> 8) & GF2Field.MASK) + 256]) ^ iArr3[((i17 >>> 16) & GF2Field.MASK) + 512]) ^ iArr3[(i18 >>> 24) + 768]) ^ iArr5[3];
            i6 = (((i20 ^ i21) ^ i22) ^ i23) ^ i24;
            i7 = (i28 ^ ((i25 ^ i26) ^ i27)) ^ i29;
            i8 = (((i31 ^ i30) ^ i32) ^ i33) ^ i34;
            int i35 = IAuthTabCallback + 49;
            onExtraCallback = i35 % 128;
            int i36 = i35 % 2;
            aESFastEngine = this;
            c = 2;
            c2 = 0;
        }
        int[] iArr6 = T;
        int i37 = iArr6[i6 & GF2Field.MASK];
        int i38 = iArr6[((i7 >>> 8) & GF2Field.MASK) + 256];
        int i39 = iArr6[((i8 >>> 16) & GF2Field.MASK) + 512];
        int i40 = iArr6[(i9 >>> 24) + 768];
        int[] iArr7 = iArr[i10];
        int i41 = (((i37 ^ i38) ^ i39) ^ i40) ^ iArr7[0];
        int i42 = (((iArr6[i7 & GF2Field.MASK] ^ iArr6[((i8 >>> 8) & GF2Field.MASK) + 256]) ^ iArr6[((i9 >>> 16) & GF2Field.MASK) + 512]) ^ iArr6[(i6 >>> 24) + 768]) ^ iArr7[1];
        int i43 = (((iArr6[i8 & GF2Field.MASK] ^ iArr6[((i9 >>> 8) & GF2Field.MASK) + 256]) ^ iArr6[((i6 >>> 16) & GF2Field.MASK) + 512]) ^ iArr6[(i7 >>> 24) + 768]) ^ iArr7[2];
        int i44 = (((iArr6[i9 & GF2Field.MASK] ^ iArr6[((i6 >>> 8) & GF2Field.MASK) + 256]) ^ iArr6[((i7 >>> 16) & GF2Field.MASK) + 512]) ^ iArr6[(i8 >>> 24) + 768]) ^ iArr7[3];
        byte[] bArr3 = S;
        byte b = bArr3[i41 & GF2Field.MASK];
        byte b2 = bArr3[(i42 >>> 8) & GF2Field.MASK];
        byte b3 = bArr3[(i43 >>> 16) & GF2Field.MASK];
        byte b4 = bArr3[i44 >>> 24];
        int[] iArr8 = iArr[i10 + 1];
        int i45 = iArr8[0];
        byte b5 = bArr3[i42 & GF2Field.MASK];
        byte b6 = bArr3[(i43 >>> 8) & GF2Field.MASK];
        byte b7 = bArr3[(i44 >>> 16) & GF2Field.MASK];
        byte b8 = bArr3[i41 >>> 24];
        int i46 = iArr8[1];
        byte b9 = bArr3[i43 & GF2Field.MASK];
        byte b10 = bArr3[(i44 >>> 8) & GF2Field.MASK];
        byte b11 = bArr3[(i41 >>> 16) & GF2Field.MASK];
        byte b12 = bArr3[i42 >>> 24];
        int i47 = iArr8[2];
        byte b13 = bArr3[i44 & GF2Field.MASK];
        byte b14 = bArr3[(i41 >>> 8) & GF2Field.MASK];
        byte b15 = bArr3[(i42 >>> 16) & GF2Field.MASK];
        byte b16 = bArr3[i43 >>> 24];
        int i48 = iArr8[3];
        Pack.intToLittleEndian(((((b & 255) ^ ((b2 & 255) << 8)) ^ ((b3 & 255) << 16)) ^ ((b4 & 255) << 24)) ^ i45, bArr2, i2);
        Pack.intToLittleEndian((((((b6 & 255) << 8) ^ (b5 & 255)) ^ ((b7 & 255) << 16)) ^ ((b8 & 255) << 24)) ^ i46, bArr2, i2 + 4);
        Pack.intToLittleEndian((((((b10 & 255) << 8) ^ (b9 & 255)) ^ ((b11 & 255) << 16)) ^ ((b12 & 255) << 24)) ^ i47, bArr2, i2 + 8);
        Pack.intToLittleEndian(((((b13 & 255) ^ ((b14 & 255) << 8)) ^ ((b15 & 255) << 16)) ^ ((b16 & 255) << 24)) ^ i48, bArr2, i2 + 12);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i = 2 % 2;
        int length = bArr.length;
        if (length >= 16) {
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0 ? length <= 32 : length <= 88) {
                if ((length & 7) == 0) {
                    int i3 = length >>> 2;
                    this.ROUNDS = i3 + 6;
                    int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3 + 7, 4);
                    int i4 = 8;
                    char c = 3;
                    if (i3 == 4) {
                        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
                        iArr[0][0] = iLittleEndianToInt;
                        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
                        iArr[0][1] = iLittleEndianToInt2;
                        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
                        iArr[0][2] = iLittleEndianToInt3;
                        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
                        iArr[0][3] = iLittleEndianToInt4;
                        for (int i5 = 1; i5 <= 10; i5++) {
                            iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i5 - 1];
                            int[] iArr2 = iArr[i5];
                            iArr2[0] = iLittleEndianToInt;
                            iLittleEndianToInt2 ^= iLittleEndianToInt;
                            iArr2[1] = iLittleEndianToInt2;
                            iLittleEndianToInt3 ^= iLittleEndianToInt2;
                            iArr2[2] = iLittleEndianToInt3;
                            iLittleEndianToInt4 ^= iLittleEndianToInt3;
                            iArr2[3] = iLittleEndianToInt4;
                        }
                    } else if (i3 == 6) {
                        int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
                        iArr[0][0] = iLittleEndianToInt5;
                        int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
                        iArr[0][1] = iLittleEndianToInt6;
                        int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
                        iArr[0][2] = iLittleEndianToInt7;
                        int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
                        iArr[0][3] = iLittleEndianToInt8;
                        int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
                        int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
                        int i6 = 1;
                        int i7 = 1;
                        while (true) {
                            int[] iArr3 = iArr[i7];
                            iArr3[0] = iLittleEndianToInt9;
                            iArr3[1] = iLittleEndianToInt10;
                            int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ i6);
                            int[] iArr4 = iArr[i7];
                            iArr4[2] = iSubWord;
                            int i8 = iLittleEndianToInt6 ^ iSubWord;
                            iArr4[3] = i8;
                            int i9 = iLittleEndianToInt7 ^ i8;
                            int[] iArr5 = iArr[i7 + 1];
                            iArr5[0] = i9;
                            int i10 = iLittleEndianToInt8 ^ i9;
                            iArr5[1] = i10;
                            int i11 = iLittleEndianToInt9 ^ i10;
                            iArr5[2] = i11;
                            int i12 = iLittleEndianToInt10 ^ i11;
                            iArr5[3] = i12;
                            int i13 = i6 << 2;
                            iLittleEndianToInt5 = iSubWord ^ ((i6 << 1) ^ subWord(shift(i12, 8)));
                            int[] iArr6 = iArr[i7 + 2];
                            iArr6[0] = iLittleEndianToInt5;
                            iLittleEndianToInt6 = i8 ^ iLittleEndianToInt5;
                            iArr6[1] = iLittleEndianToInt6;
                            iLittleEndianToInt7 = i9 ^ iLittleEndianToInt6;
                            iArr6[2] = iLittleEndianToInt7;
                            iLittleEndianToInt8 = i10 ^ iLittleEndianToInt7;
                            iArr6[3] = iLittleEndianToInt8;
                            i7 += 3;
                            if (i7 >= 13) {
                                break;
                            }
                            iLittleEndianToInt9 = i11 ^ iLittleEndianToInt8;
                            iLittleEndianToInt10 = i12 ^ iLittleEndianToInt9;
                            i6 = i13;
                        }
                    } else {
                        if (i3 != 8) {
                            throw new IllegalStateException("Should never get here");
                        }
                        int i14 = onExtraCallback + 107;
                        IAuthTabCallback = i14 % 128;
                        int i15 = i14 % 2;
                        int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
                        iArr[0][0] = iLittleEndianToInt11;
                        int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
                        iArr[0][1] = iLittleEndianToInt12;
                        int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
                        iArr[0][2] = iLittleEndianToInt13;
                        int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
                        iArr[0][3] = iLittleEndianToInt14;
                        int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
                        iArr[1][0] = iLittleEndianToInt15;
                        int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
                        iArr[1][1] = iLittleEndianToInt16;
                        int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
                        iArr[1][2] = iLittleEndianToInt17;
                        int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
                        iArr[1][3] = iLittleEndianToInt18;
                        int i16 = 2;
                        int i17 = 1;
                        while (true) {
                            int i18 = i17 << 1;
                            iLittleEndianToInt11 ^= subWord(shift(iLittleEndianToInt18, i4)) ^ i17;
                            int[] iArr7 = iArr[i16];
                            iArr7[0] = iLittleEndianToInt11;
                            iLittleEndianToInt12 ^= iLittleEndianToInt11;
                            iArr7[1] = iLittleEndianToInt12;
                            iLittleEndianToInt13 ^= iLittleEndianToInt12;
                            iArr7[2] = iLittleEndianToInt13;
                            iLittleEndianToInt14 ^= iLittleEndianToInt13;
                            iArr7[c] = iLittleEndianToInt14;
                            int i19 = i16 + 1;
                            if (i19 >= 15) {
                                break;
                            }
                            int i20 = IAuthTabCallback + 101;
                            onExtraCallback = i20 % 128;
                            int i21 = i20 % 2;
                            iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                            int[] iArr8 = iArr[i19];
                            iArr8[0] = iLittleEndianToInt15;
                            iLittleEndianToInt16 ^= iLittleEndianToInt15;
                            iArr8[1] = iLittleEndianToInt16;
                            iLittleEndianToInt17 ^= iLittleEndianToInt16;
                            iArr8[2] = iLittleEndianToInt17;
                            iLittleEndianToInt18 ^= iLittleEndianToInt17;
                            iArr8[3] = iLittleEndianToInt18;
                            i16 += 2;
                            i17 = i18;
                            i4 = 8;
                            c = 3;
                        }
                    }
                    if (!z) {
                        for (int i22 = 1; i22 < this.ROUNDS; i22++) {
                            for (int i23 = 0; i23 < 4; i23++) {
                                int[] iArr9 = iArr[i22];
                                iArr9[i23] = inv_mcol(iArr9[i23]);
                            }
                        }
                    }
                    return iArr;
                }
            }
        }
        throw new IllegalArgumentException("Key length not 128/192/256 bits.");
    }

    private static int inv_mcol(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iShift = shift(i, 8) ^ i;
        int iFFmulX = i ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        int iShift2 = iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
        int i5 = IAuthTabCallback + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iShift2;
    }

    private static int shift(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 79;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        int i7 = (i >>> i2) | (i << (-i2));
        int i8 = i5 + 99;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    private static int subWord(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        byte[] bArr = S;
        int i6 = ((bArr[i >>> 24] & 255) << 24) | (bArr[i & GF2Field.MASK] & 255) | ((bArr[(i >>> 8) & GF2Field.MASK] & 255) << 8) | ((bArr[(i >>> 16) & GF2Field.MASK] & 255) << 16);
        int i7 = i4 + 123;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAlgorithmName() throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int[] iArr = {0, 3, 1, 2};
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(iArr, true, null, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(iArr, true, null, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    public int getBlockSize() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2 != 0 ? 38 : 16;
        int i5 = i2 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        int i5 = i2 + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
        this.forEncryption = z;
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws Throwable {
        int i3 = 2 % 2;
        int[][] iArr = this.WorkingKey;
        if (iArr == null) {
            Object[] objArr = new Object[1];
            a(new int[]{3, 26, 156, 23}, false, new byte[]{0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        int i4 = IAuthTabCallback + 89;
        int i5 = i4 % 128;
        onExtraCallback = i5;
        int i6 = i4 % 2;
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length - 16) {
            throw new OutputLengthException("output buffer too short");
        }
        int i7 = i5 + 45;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        if (this.forEncryption) {
            int i9 = i5 + 125;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                encryptBlock(bArr, i, bArr2, i2, iArr);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            encryptBlock(bArr, i, bArr2, i2, iArr);
        } else {
            decryptBlock(bArr, i, bArr2, i2, iArr);
        }
        return 16;
    }

    public void reset() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onNavigationEvent;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 45;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), 35 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 35283), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 36, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
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
                int i9 = $11 + 117;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 10935), Color.red(0) + 65, 16718 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 28 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 70, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i13 = $10 + 105;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
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
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{27144, 27148, 27162, 27152, 27280, 27467, 27464, 27466, 27465, 27467, 27280, 27309, 27460, 27459, 27304, 27310, 27465, 27465, 27460, 27460, 27471, 27468, 27464, 27460, 27462, 27470, 27296, 27281, 27302};
    }
}
