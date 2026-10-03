package viva.republica.toss.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.deeplink.annotation.PrivateDeepLink;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.SessionTrackerb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.SchemeAlertActivity$;

@PrivateDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SchemeAlertActivity extends Hilt_SchemeAlertActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallbackDefault;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asBinder;
    private static boolean asInterface;
    private static boolean onTransact;

    @Inject
    public SessionTrackerb tossRouter;

    static {
        IAuthTabCallback();
        Companion = new onNavigationEvent(null);
        IAuthTabCallbackDefault = 8;
        int i = IAuthTabCallbackStubProxy + 75;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, String str3, String str4, boolean z, String str5, SchemeAlertActivity schemeAlertActivity, String str6, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, str2, str3, str4, z, str5, schemeAlertActivity, str6, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        int i5 = access000 + 9;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SchemeAlertActivity schemeAlertActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 107;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(str, schemeAlertActivity, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, schemeAlertActivity, dialogInterface);
        int i3 = access000 + 5;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SchemeAlertActivity schemeAlertActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(schemeAlertActivity, dialogInterface);
        }
        onWarmupCompleted(schemeAlertActivity, dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SchemeAlertActivity schemeAlertActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, schemeAlertActivity, dialogInterface);
        int i4 = access100 + 37;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 83;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = access100 + 9;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final SessionTrackerb onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 123;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            int i5 = i2 + 51;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                return sessionTrackerb;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = access000 + 123;
        access100 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 111;
        access100 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 35;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(java.lang.String r9, viva.republica.toss.common.SchemeAlertActivity r10, android.content.DialogInterface r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.SchemeAlertActivity.access100
            int r1 = r1 + 1
            int r2 = r1 % 128
            viva.republica.toss.common.SchemeAlertActivity.access000 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            int r11 = r9.length()
            r1 = 56
            int r1 = r1 / 0
            if (r11 <= 0) goto L40
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            int r11 = r9.length()
            if (r11 <= 0) goto L40
        L27:
            int r11 = viva.republica.toss.common.SchemeAlertActivity.access100
            int r11 = r11 + 49
            int r1 = r11 % 128
            viva.republica.toss.common.SchemeAlertActivity.access000 = r1
            int r11 = r11 % r0
            o.SessionTrackerb r0 = r10.onNavigationEvent()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            r1 = r10
            r2 = r9
            o.SessionTrackerb.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L40:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.SchemeAlertActivity.onNavigationEvent(java.lang.String, viva.republica.toss.common.SchemeAlertActivity, android.content.DialogInterface):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(String str, SchemeAlertActivity schemeAlertActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            str.length();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (str.length() > 0) {
            SessionTrackerb.IAuthTabCallback(schemeAlertActivity.onNavigationEvent(), schemeAlertActivity, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = access100 + 25;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(SchemeAlertActivity schemeAlertActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        schemeAlertActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(String str, String str2, String str3, String str4, boolean z, String str5, SchemeAlertActivity schemeAlertActivity, String str6, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
            str3.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        if (str3.length() > 0) {
            Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str3, (TdsButtonV1View.asInterface) null, false, new SchemeAlertActivity$.ExternalSyntheticLambda0(str5, schemeAlertActivity), 6, (Object) null)};
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int i3 = access000 + 81;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        }
        if (str4.length() > 0) {
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str4, (TdsButtonV1View.asInterface) null, false, new SchemeAlertActivity$.ExternalSyntheticLambda1(str6, schemeAlertActivity), 6, (Object) null)};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        commonModule_setLeftEdgeTouchEnabled.asBinder(new SchemeAlertActivity$.ExternalSyntheticLambda2(schemeAlertActivity));
        Object[] objArr3 = {commonModule_setLeftEdgeTouchEnabled, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, objArr3, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:6|(1:194)(2:10|(0)(2:12|(2:14|(2:16|(0)(5:19|(1:21)(2:22|(1:24)(2:25|(1:27)(2:28|(1:30)(2:31|(1:33)(2:34|(1:36)(2:37|(1:39)(2:40|(1:42)(2:43|(2:45|(7:47|(4:50|(3:1691|52|1694)(1:1693)|1692|48)|1690|53|(2:56|54)|1695|57)(2:58|(7:60|(4:63|(3:1696|65|1700)(1:1699)|1698|61)|1697|66|(2:69|67)|1701|70)(2:71|(7:73|(4:76|(3:1703|78|1706)(1:1705)|1704|74)|1702|79|(2:82|80)|1707|83)(2:84|(7:86|(4:89|(3:1709|91|1712)(1:1711)|1710|87)|1708|92|(2:95|93)|1713|96)(2:97|(7:99|(4:102|(3:1715|104|1718)(1:1717)|1716|100)|1714|105|(2:108|106)|1719|109)(2:110|(7:112|(4:115|(3:1721|117|1724)(1:1723)|1722|113)|1720|118|(2:121|119)|1725|122)(2:123|(7:125|(4:128|(3:1726|130|1730)(1:1729)|1728|126)|1727|131|(2:134|132)|1731|135)(2:136|(7:138|(4:141|(3:1733|143|1736)(1:1735)|1734|139)|1732|144|(2:147|145)|1737|148)(2:149|(4:151|(4:154|(3:1739|156|1742)(1:1741)|1740|152)|1738|157)(3:158|(6:160|(1:162)|1743|163|(2:164|(2:166|(1:1745)(1:1746))(2:1744|169))|170)(1:171)|(2:173|(2:175|(1:177)(2:178|179))(2:180|181))))))))))))))))))))|182|(1:184)|185))(0))(5:186|(1:188)(1:189)|190|(1:192)|193)))|195|(1:197)(1:198)|199|(4:(1:392)(25:203|(0)(2:205|(2:207|(2:209|(2:211|(6:213|(1:215)(2:217|(1:219)(2:220|(1:222)(2:223|(1:225)(2:226|(1:228)(2:229|(2:231|(1:233)(1:234))(2:235|(1:237)(2:238|(1:240)(5:241|(3:243|(7:245|(4:248|(3:1634|250|1637)(1:1636)|1635|246)|1633|251|(2:254|252)|1638|255)(2:257|(7:259|(4:262|(3:1640|264|1643)(1:1642)|1641|260)|1639|265|(2:268|266)|1644|269)(2:270|(7:272|(4:275|(3:1646|277|1649)(1:1648)|1647|273)|1645|278|(2:281|279)|1650|282)(2:283|(7:285|(4:288|(3:1651|290|1655)(1:1654)|1653|286)|1652|291|(2:294|292)|1656|295)(2:296|(7:298|(4:301|(3:1658|303|1661)(1:1660)|1659|299)|1657|304|(2:307|305)|1662|308)(2:309|(7:311|(4:314|(3:1664|316|1667)(1:1666)|1665|312)|1663|317|(2:320|318)|1668|321)(2:322|(7:324|(4:327|(3:1670|329|1673)(1:1672)|1671|325)|1669|330|(2:333|331)|1674|334)(2:335|(7:337|(4:340|(3:1676|342|1679)(1:1678)|1677|338)|1675|343|(2:346|344)|1680|347)(3:348|(4:350|(4:353|(3:1682|355|1685)(1:1684)|1683|351)|1681|356)(3:358|(6:360|(1:362)|1686|363|(2:364|(2:366|(1:1688)(1:1689))(2:1687|369))|370)(1:371)|(2:373|(1:375)(2:376|377)))|357))))))))|256)|378|(1:380)|381))))))))|216|378|(0)|381)))(2:382|383))(6:384|(1:386)(1:387)|388|(1:390)|391|394))|(1:396)(1:397)|398|(1:581)(2:404|(2:406|(0)(5:410|(1:412)(2:413|(1:415)(2:416|(1:418)(2:419|(1:421)(2:422|(1:424)(2:425|(1:427)(2:428|(1:430)(2:431|(1:433)(2:434|(2:436|(7:438|(4:441|(3:1577|443|1580)(1:1579)|1578|439)|1576|444|(2:447|445)|1581|448)(2:449|(7:451|(4:454|(3:1583|456|1586)(1:1585)|1584|452)|1582|457|(2:460|458)|1587|461)(2:462|(7:464|(4:467|(3:1589|469|1592)(1:1591)|1590|465)|1588|470|(2:473|471)|1593|474)(2:475|(7:477|(4:480|(3:1594|482|1598)(1:1597)|1596|478)|1595|483|(2:486|484)|1599|487)(2:488|(7:490|(4:493|(3:1601|495|1604)(1:1603)|1602|491)|1600|496|(2:499|497)|1605|500)(2:501|(7:503|(4:506|(3:1607|508|1610)(1:1609)|1608|504)|1606|509|(2:512|510)|1611|513)(2:514|(7:516|(4:519|(3:1613|521|1616)(1:1615)|1614|517)|1612|522|(2:525|523)|1617|526)(2:527|(7:529|(4:532|(3:1619|534|1622)(1:1621)|1620|530)|1618|535|(2:538|536)|1623|539)(2:540|(4:542|(4:545|(3:1625|547|1628)(1:1627)|1626|543)|1624|548)(3:549|(6:551|(1:553)|1629|554|(2:555|(2:557|(1:1631)(1:1632))(2:1630|560))|561)(1:562)|(2:564|(1:566)(2:567|568))))))))))))))))))))|569|(1:571)|572))(5:573|(1:575)(1:576)|577|(1:579)|580))|(1:583)(1:584)|585|(1:769)(2:591|(2:593|(0)(5:597|(1:599)(2:600|(1:602)(2:603|(1:605)(2:606|(1:608)(2:609|(1:611)(2:612|(1:614)(2:615|(1:617)(2:618|(1:620)(2:621|(2:623|(7:625|(4:628|(3:1520|630|1523)(1:1522)|1521|626)|1519|631|(2:634|632)|1524|635)(2:636|(7:638|(4:641|(3:1526|643|1529)(1:1528)|1527|639)|1525|644|(2:647|645)|1530|648)(2:649|(7:651|(4:654|(3:1532|656|1535)(1:1534)|1533|652)|1531|657|(2:660|658)|1536|661)(2:662|(7:664|(4:667|(3:1538|669|1541)(1:1540)|1539|665)|1537|670|(2:673|671)|1542|674)(2:675|(7:677|(4:680|(3:1544|682|1547)(1:1546)|1545|678)|1543|683|(2:686|684)|1548|687)(2:688|(7:690|(4:693|(3:1550|695|1553)(1:1552)|1551|691)|1549|696|(2:699|697)|1554|700)(2:701|(7:703|(4:706|(3:1556|708|1559)(1:1558)|1557|704)|1555|709|(2:712|710)|1560|713)(2:714|(7:716|(4:719|(3:1561|721|1565)(1:1564)|1563|717)|1562|722|(2:725|723)|1566|726)(2:727|(4:729|(4:732|(3:1568|734|1571)(1:1570)|1569|730)|1567|735)(3:736|(6:738|(1:740)|1572|741|(2:742|(2:744|(1:1574)(1:1575))(2:1573|747))|748)(1:749)|(2:751|(1:753)(2:754|755))))))))))))))))))))|756|(1:759)|760))(5:761|(1:763)(1:764)|765|(1:767)|768))|(1:771)(1:772)|773|(1:956)(2:779|(2:781|(0)(5:785|(1:787)(2:788|(1:790)(2:791|(1:793)(2:794|(1:796)(2:797|(1:799)(2:800|(1:802)(2:803|(1:805)(2:806|(1:808)(2:809|(2:811|(7:813|(4:816|(3:1462|818|1466)(1:1465)|1464|814)|1463|819|(2:822|820)|1467|823)(2:824|(7:826|(4:829|(3:1469|831|1472)(1:1471)|1470|827)|1468|832|(2:835|833)|1473|836)(2:837|(7:839|(4:842|(3:1475|844|1478)(1:1477)|1476|840)|1474|845|(2:848|846)|1479|849)(2:850|(7:852|(4:855|(3:1481|857|1484)(1:1483)|1482|853)|1480|858|(2:861|859)|1485|862)(2:863|(7:865|(4:868|(3:1487|870|1490)(1:1489)|1488|866)|1486|871|(2:874|872)|1491|875)(2:876|(7:878|(4:881|(3:1493|883|1496)(1:1495)|1494|879)|1492|884|(2:887|885)|1497|888)(2:889|(7:891|(4:894|(3:1499|896|1502)(1:1501)|1500|892)|1498|897|(2:900|898)|1503|901)(2:902|(7:904|(4:907|(3:1505|909|1508)(1:1507)|1506|905)|1504|910|(2:913|911)|1509|914)(2:915|(4:917|(4:920|(3:1511|922|1514)(1:1513)|1512|918)|1510|923)(3:924|(6:926|(1:928)|1515|929|(2:930|(2:932|(1:1517)(1:1518))(2:1516|935))|936)(1:937)|(2:939|(1:941)(2:942|943))))))))))))))))))))|944|(1:946)|947))(5:948|(1:950)(1:951)|952|(1:954)|955))|(1:958)(1:959)|960|(1:1143)(2:966|(2:968|(0)(5:972|(1:974)(2:975|(1:977)(2:978|(1:980)(2:981|(1:983)(2:984|(1:986)(2:987|(1:989)(2:990|(1:992)(2:993|(1:995)(2:996|(2:998|(7:1000|(4:1003|(3:1406|1005|1409)(1:1408)|1407|1001)|1405|1006|(2:1009|1007)|1410|1010)(2:1011|(7:1013|(4:1016|(3:1412|1018|1415)(1:1414)|1413|1014)|1411|1019|(2:1022|1020)|1416|1023)(2:1024|(7:1026|(4:1029|(3:1418|1031|1421)(1:1420)|1419|1027)|1417|1032|(2:1035|1033)|1422|1036)(2:1037|(7:1039|(4:1042|(3:1424|1044|1427)(1:1426)|1425|1040)|1423|1045|(2:1048|1046)|1428|1049)(2:1050|(7:1052|(4:1055|(3:1429|1057|1433)(1:1432)|1431|1053)|1430|1058|(2:1061|1059)|1434|1062)(2:1063|(7:1065|(4:1068|(3:1436|1070|1439)(1:1438)|1437|1066)|1435|1071|(2:1074|1072)|1440|1075)(2:1076|(7:1078|(4:1081|(3:1442|1083|1445)(1:1444)|1443|1079)|1441|1084|(2:1087|1085)|1446|1088)(2:1089|(7:1091|(4:1094|(3:1448|1096|1451)(1:1450)|1449|1092)|1447|1097|(2:1100|1098)|1452|1101)(2:1102|(4:1104|(4:1107|(3:1454|1109|1457)(1:1456)|1455|1105)|1453|1110)(3:1111|(6:1113|(1:1115)|1458|1116|(2:1117|(2:1119|(1:1459)(1:1461))(2:1460|1122))|1123)(1:1124)|(2:1126|(1:1128)(2:1129|1130))))))))))))))))))))|1131|(1:1133)|1134))(5:1135|(1:1137)(1:1138)|1139|(1:1141)|1142))|(1:1145)(1:1146)|1147|(2:1153|(2:1155|(5:1160|(1:1162)(2:1163|(1:1165)(2:1166|(1:1168)(2:1169|(1:1171)(2:1172|(1:1174)(2:1175|(1:1177)(2:1178|(1:1180)(2:1181|(1:1183)(2:1184|(2:1186|(7:1188|(4:1191|(3:1349|1193|1352)(1:1351)|1350|1189)|1348|1194|(2:1197|1195)|1353|1198)(2:1199|(7:1201|(4:1204|(3:1355|1206|1358)(1:1357)|1356|1202)|1354|1207|(2:1210|1208)|1359|1211)(2:1212|(7:1214|(4:1217|(3:1361|1219|1364)(1:1363)|1362|1215)|1360|1220|(2:1223|1221)|1365|1224)(2:1225|(7:1227|(4:1230|(3:1367|1232|1370)(1:1369)|1368|1228)|1366|1233|(2:1236|1234)|1371|1237)(2:1238|(7:1240|(4:1243|(3:1373|1245|1376)(1:1375)|1374|1241)|1372|1246|(2:1249|1247)|1377|1250)(2:1251|(7:1253|(4:1256|(3:1379|1258|1382)(1:1381)|1380|1254)|1378|1259|(2:1262|1260)|1383|1263)(2:1264|(7:1266|(4:1269|(3:1385|1271|1388)(1:1387)|1386|1267)|1384|1272|(2:1275|1273)|1389|1276)(2:1277|(7:1279|(4:1282|(3:1391|1284|1394)(1:1393)|1392|1280)|1390|1285|(2:1288|1286)|1395|1289)(2:1290|(4:1292|(4:1295|(3:1396|1297|1400)(1:1399)|1398|1293)|1397|1298)(3:1299|(6:1301|(1:1303)|1401|1304|(2:1305|(2:1402|1307)(2:1308|(1:1403)(1:1404)))|1310)(1:1311)|(2:1313|(1:1315)(2:1316|1317))))))))))))))))))))|1318|(1:1321)|1322))(5:1323|(1:1325)(1:1326)|1327|(1:1330)|1331))|(1:1334)|1335|1344|1336|1337|1346|1338|1339)|1346|1338|1339)|393|394|(0)(0)|398|(2:400|581)(0)|(0)(0)|585|(2:587|769)(0)|(0)(0)|773|(2:775|956)(0)|(0)(0)|960|(2:962|1143)(0)|(0)(0)|1147|(4:1149|1151|1153|(0)(0))|(0)|1335|1344|1336|1337) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1143:0x214e  */
    /* JADX WARN: Removed duplicated region for block: B:1145:0x2151  */
    /* JADX WARN: Removed duplicated region for block: B:1146:0x2154  */
    /* JADX WARN: Removed duplicated region for block: B:1155:0x2173  */
    /* JADX WARN: Removed duplicated region for block: B:1323:0x268d  */
    /* JADX WARN: Removed duplicated region for block: B:1334:0x26a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x1175  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x1178  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x16b2  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x16b5  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x16b8  */
    /* JADX WARN: Removed duplicated region for block: B:956:0x1c00  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x1c03  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x1c06  */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v135, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v145, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v155, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v157, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v161, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v162, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v164, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v169, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v187 */
    /* JADX WARN: Type inference failed for: r0v192, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v197, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v202, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v207, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v212, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v217, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v222, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v227, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v232, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v234, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v236, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v237, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v238, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v239, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v240, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v241, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v242 */
    /* JADX WARN: Type inference failed for: r0v246, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v255, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v256 */
    /* JADX WARN: Type inference failed for: r0v257 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v269, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v274, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v279, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v284, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v289, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v294, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v299, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v304, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v309, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v311, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v313, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v314, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v315, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v316, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v317, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v318, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v319 */
    /* JADX WARN: Type inference failed for: r0v323, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v332, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v333 */
    /* JADX WARN: Type inference failed for: r0v334 */
    /* JADX WARN: Type inference failed for: r0v340 */
    /* JADX WARN: Type inference failed for: r0v341 */
    /* JADX WARN: Type inference failed for: r0v346, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v351, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v356, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v361, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v366, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v371, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v376, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v381, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v386, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v388, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v390, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v391, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v392, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v393, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v394, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v395, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v396 */
    /* JADX WARN: Type inference failed for: r0v400, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v501, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v502 */
    /* JADX WARN: Type inference failed for: r0v503 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v513 */
    /* JADX WARN: Type inference failed for: r0v514 */
    /* JADX WARN: Type inference failed for: r0v519, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v524, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v529, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v534, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v539, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v544, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v549, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v554, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v559, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v561, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v563, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v564, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v565, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v566, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v567, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v568, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v569 */
    /* JADX WARN: Type inference failed for: r0v573, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.common.SchemeAlertActivity] */
    @Override // viva.republica.toss.common.Hilt_SchemeAlertActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 9976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.SchemeAlertActivity.onCreate(android.os.Bundle):void");
    }

    public static final class onNavigationEvent {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private static char[] IAuthTabCallback = {51245, 64961, 64976, 64982, 64967, 64991, 51243, 64960, 64983, 51240, 64989, 64986, 51244, 51242, 64988, 64963};
        private static char onExtraCallbackWithResult = 51245;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) SchemeAlertActivity.class);
            Object[] objArr = new Object[1];
            a(new char[]{7, '\b', 5, 6, 13827}, (byte) (Color.green(0) + 4), 5 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            Intent intentPutExtra = intent.putExtra(((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            a(new char[]{11, 0, 6, 3, 3, '\t', '\f', 7, '\n', 15, 13865}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 52), 11 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr2[0]).intern(), str2).putExtra("okTitle", str3).putExtra("okUrl", str4).putExtra("cancelTitle", str5).putExtra("cancelUrl", str6).putExtra("cancelable", z);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "");
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
            return intentPutExtra2;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int i4 = $10 + 125;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), Color.argb(0, 0, 0, 0) + 26, 23139 - View.MeasureSpec.getMode(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 26, 23139 - ((Process.getThreadPriority(0) + 20) >> 6), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $10 + 3;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    i2 = i + 103;
                    cArr4[i2] = (char) (cArr[i2] << b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - KeyEvent.getDeadChar(0, 0)), 74 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), ImageFormat.getBitsPerPixel(0) + 31, 19488 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            } else {
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i13 = 0; i13 < i; i13++) {
                cArr4[i13] = (char) (cArr4[i13] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackStub;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 76, 20951 - TextUtils.lastIndexOf("", '0', 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    int i4 = $10 + 59;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 75 - (ViewConfiguration.getTapTimeout() >> 16), 16037 - TextUtils.indexOf("", ""), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        float f = 0.0f;
        if (onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i6 = $10 + 79;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 5;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 63 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12214 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asInterface) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        int i8 = $11 + 45;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 125;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) + 63, 12215 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            f = 0.0f;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // viva.republica.toss.common.Hilt_SchemeAlertActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 3;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = access100 + 55;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.common.Hilt_SchemeAlertActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.common.Hilt_SchemeAlertActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 47;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
    }

    @Override // viva.republica.toss.common.Hilt_SchemeAlertActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 55;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallbackStub = new char[]{32736, 32747, 32744, 32759, 32752, 32737, 32753, 32738, 32748, 32749, 32750};
        asBinder = -1184333924;
        asInterface = true;
        onTransact = true;
    }
}
