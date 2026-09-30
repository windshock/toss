package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tmoney.kscc.sslio.constants.APIConstants;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RoomConnectionManager extends TypeAdapter implements getGainFactorAt {
    private Gson IAuthTabCallback;
    private DefaultGainProviderExternalSyntheticLambda3 onExtraCallbackWithResult;
    private DefaultGainProviderBuilderExternalSyntheticLambda1 onNavigationEvent;

    public RoomConnectionManager(Gson gson, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        this.IAuthTabCallback = gson;
        this.onExtraCallbackWithResult = defaultGainProviderExternalSyntheticLambda3;
        this.onNavigationEvent = defaultGainProviderBuilderExternalSyntheticLambda1;
    }

    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.onNavigationEvent.onNavigationEvent(jsonWriter, obj == APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0001 ? 619 : obj == APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0002 ? 860 : obj == APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0003 ? 803 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016 ? 322 : obj == APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0004 ? 219 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0015 ? 59 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0014 ? 448 : obj == APIConstants.EAPI_CONST.EAPI_CONST_008_BLMV_0001 ? 874 : obj == APIConstants.EAPI_CONST.EAPI_CONST_008_BLMV_0002 ? 378 : obj == APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0004 ? 425 : obj == APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0003 ? 69 : obj == APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0002 ? 812 : obj == APIConstants.EAPI_CONST.EAPI_CONST_000_SEVER_CERT ? 846 : obj == APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0009 ? 284 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0009 ? 578 : obj == APIConstants.EAPI_CONST.EAPI_CONST_005_TM_0001 ? 36 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0008 ? 237 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0007 ? 426 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0006 ? 282 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0005 ? 631 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0004 ? 355 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0003 ? 594 : obj == APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0001 ? 285 : obj == APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0002 ? 880 : obj == APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0003 ? 495 : obj == APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0004 ? 781 : obj == APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0005 ? 872 : obj == APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0006 ? 826 : obj == APIConstants.EAPI_CONST.EAPI_CONST_005_TM_0002 ? 784 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0003 ? 498 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0002 ? 201 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0005 ? 252 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0004 ? 805 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0006 ? 749 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0008 ? 434 : obj == APIConstants.EAPI_CONST.EAPI_CONST_018_AFLT_0001 ? 513 : obj == APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0001 ? 593 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0017 ? 754 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0018 ? 17 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0015 ? 673 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0016 ? 79 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0010 ? 816 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0013 ? 86 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0011 ? 455 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0012 ? 778 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0006 ? 423 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0007 ? 810 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0008 ? 469 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0009 ? 202 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0002 ? 197 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0003 ? 299 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0004 ? 699 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0005 ? 701 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0002 ? 782 : obj == APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001 ? 509 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0001 ? 57 : obj == APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0012 ? 562 : obj == APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0001 ? 473 : obj == APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0011 ? 77 : obj == APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0010 ? 12 : obj == APIConstants.EAPI_CONST.EAPI_CONST_015_UCAD_0002 ? 620 : obj == APIConstants.EAPI_CONST.EAPI_CONST_015_UCAD_0001 ? 536 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0019 ? 52 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0013 ? 764 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0014 ? 72 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0015 ? 62 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0010 ? 762 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0011 ? 234 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0012 ? 97 : obj == APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0004 ? 728 : obj == APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0003 ? 840 : obj == APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0002 ? 505 : obj == APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0001 ? 200 : obj == APIConstants.EAPI_CONST.EAPI_CONST_004_SIN_0001 ? 190 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0016 ? 824 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0010 ? 507 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0014 ? 710 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0015 ? 648 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0012 ? 134 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0013 ? 174 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0006 ? 732 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0007 ? 597 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0004 ? 315 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0005 ? 766 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0008 ? 621 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0009 ? 652 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0002 ? 499 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0003 ? 854 : obj == APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0001 ? 515 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0007 ? 70 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0008 ? 682 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0005 ? 160 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0006 ? 21 : obj == APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0001 ? 208 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0009 ? 317 : obj == APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0002 ? 692 : obj == APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0032 ? 180 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0003 ? 755 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0004 ? 715 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0001 ? 183 : obj == APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0002 ? 842 : obj == APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0003 ? 649 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0007 ? 50 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0002 ? 488 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0001 ? 82 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0004 ? 313 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0003 ? 172 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0006 ? 442 : obj == APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0005 ? 383 : -1);
        }
    }

    public Object read(JsonReader jsonReader) throws IOException {
        switch (this.onExtraCallbackWithResult.onExtraCallbackWithResult(jsonReader)) {
            case 3:
                return APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0001;
            case 25:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0007;
            case 33:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0005;
            case 37:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0001;
            case 48:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0010;
            case 85:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0003;
            case 98:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0010;
            case 99:
                return APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0011;
            case 128:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0005;
            case 134:
                return APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0001;
            case 136:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0007;
            case 149:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0009;
            case 151:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0006;
            case 153:
                return APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0004;
            case 154:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0009;
            case 170:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0001;
            case 185:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0005;
            case 193:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0009;
            case 198:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0002;
            case 199:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0016;
            case 202:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0001;
            case 206:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0002;
            case 215:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0015;
            case 223:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0004;
            case 232:
                return APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0004;
            case 235:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0011;
            case 243:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0014;
            case 246:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0013;
            case 249:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0001;
            case 257:
                return APIConstants.EAPI_CONST.EAPI_CONST_000_SEVER_CERT;
            case 262:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0008;
            case 275:
                return APIConstants.EAPI_CONST.EAPI_CONST_004_SIN_0001;
            case 276:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0001;
            case 285:
                return APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0012;
            case 286:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0018;
            case 294:
                return APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0009;
            case 301:
                return APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0003;
            case 309:
                return APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0004;
            case 317:
                return APIConstants.EAPI_CONST.EAPI_CONST_008_BLMV_0002;
            case 341:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0005;
            case 345:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0004;
            case 347:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0007;
            case 353:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0003;
            case 359:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0014;
            case 368:
                return APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0002;
            case 369:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0006;
            case 381:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0008;
            case 411:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0013;
            case 420:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0015;
            case 423:
                return APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0001;
            case 429:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0002;
            case 437:
                return APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0005;
            case 451:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0006;
            case 461:
                return APIConstants.EAPI_CONST.EAPI_CONST_008_BLMV_0001;
            case 470:
                return APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0003;
            case 504:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0015;
            case 512:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0007;
            case 516:
                return APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0001;
            case 522:
                return APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0003;
            case 527:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0006;
            case 544:
                return APIConstants.EAPI_CONST.EAPI_CONST_015_UCAD_0002;
            case 575:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0003;
            case 579:
                return APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0002;
            case 582:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0003;
            case 600:
                return APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0003;
            case 608:
                return APIConstants.EAPI_CONST.EAPI_CONST_016_TMCR_0010;
            case 620:
                return APIConstants.EAPI_CONST.EAPI_CONST_018_AFLT_0001;
            case 626:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0008;
            case 635:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0004;
            case 640:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0001;
            case 646:
                return APIConstants.EAPI_CONST.EAPI_CONST_014_STUP_0002;
            case 648:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0012;
            case 650:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0016;
            case 656:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0005;
            case 658:
                return APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0004;
            case 660:
                return APIConstants.EAPI_CONST.EAPI_CONST_002_PRCG_0002;
            case 661:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0003;
            case 682:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0002;
            case 689:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0011;
            case 694:
                return APIConstants.EAPI_CONST.EAPI_CONST_015_UCAD_0001;
            case 698:
                return APIConstants.EAPI_CONST.EAPI_CONST_010_GIFT_0004;
            case 700:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0009;
            case 701:
                return APIConstants.EAPI_CONST.EAPI_CONST_011_ACRY_0001;
            case 702:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0015;
            case 705:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0012;
            case 716:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0003;
            case 719:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0004;
            case 720:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0010;
            case 732:
                return APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0006;
            case 736:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0017;
            case 740:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0006;
            case 741:
                return APIConstants.EAPI_CONST.EAPI_CONST_009_MSS_0003;
            case 751:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0007;
            case 756:
                return APIConstants.EAPI_CONST.EAPI_CONST_007_DCRG_0002;
            case 759:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0014;
            case 766:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0032;
            case 778:
                return APIConstants.EAPI_CONST.EAPI_CONST_013_CRAPI_0002;
            case 780:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0016;
            case 781:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0008;
            case 792:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0006;
            case 799:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0002;
            case 803:
                return APIConstants.EAPI_CONST.EAPI_CONST_001_MBR_0019;
            case 812:
                return APIConstants.EAPI_CONST.EAPI_CONST_005_TM_0002;
            case 848:
                return APIConstants.EAPI_CONST.EAPI_CONST_003_DPCG_0005;
            case 853:
                return APIConstants.EAPI_CONST.EAPI_CONST_005_TM_0001;
            case 854:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0013;
            case 858:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0008;
            case 866:
                return APIConstants.EAPI_CONST.EAPI_CONST_006_TRDR_0012;
            case 872:
                return APIConstants.EAPI_CONST.EAPI_CONST_012_PMM_0004;
            default:
                return null;
        }
    }
}
