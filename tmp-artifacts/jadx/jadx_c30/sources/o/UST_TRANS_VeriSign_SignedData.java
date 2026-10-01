package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class UST_TRANS_VeriSign_SignedData extends UST_TRANS_V2_Init {
    private static final long serialVersionUID = -9119388488683035101L;
    private final String context;
    private final UST_TRANS_V2_SendReceiverInfo contextMark;
    private final String note;
    private final String problem;
    private final UST_TRANS_V2_SendReceiverInfo problemMark;

    public UST_TRANS_VeriSign_SignedData(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, String str2, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, String str3) {
        this(str, uST_TRANS_V2_SendReceiverInfo, str2, uST_TRANS_V2_SendReceiverInfo2, str3, null);
    }

    public UST_TRANS_VeriSign_SignedData(String str, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, String str2, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2, String str3, Throwable th) {
        super(str + "; " + str2 + "; " + uST_TRANS_V2_SendReceiverInfo2, th);
        this.context = str;
        this.contextMark = uST_TRANS_V2_SendReceiverInfo;
        this.problem = str2;
        this.problemMark = uST_TRANS_V2_SendReceiverInfo2;
        this.note = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.context;
        if (str != null) {
            sb.append(str);
            sb.append("\n");
        }
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo = this.contextMark;
        if (uST_TRANS_V2_SendReceiverInfo != null && (this.problem == null || this.problemMark == null || uST_TRANS_V2_SendReceiverInfo.onWarmupCompleted().equals(this.problemMark.onWarmupCompleted()) || this.contextMark.onNavigationEvent() != this.problemMark.onNavigationEvent() || this.contextMark.onExtraCallback() != this.problemMark.onExtraCallback())) {
            sb.append(this.contextMark);
            sb.append("\n");
        }
        String str2 = this.problem;
        if (str2 != null) {
            sb.append(str2);
            sb.append("\n");
        }
        UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2 = this.problemMark;
        if (uST_TRANS_V2_SendReceiverInfo2 != null) {
            sb.append(uST_TRANS_V2_SendReceiverInfo2);
            sb.append("\n");
        }
        String str3 = this.note;
        if (str3 != null) {
            sb.append(str3);
            sb.append("\n");
        }
        return sb.toString();
    }
}
