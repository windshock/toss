package com.tmoney.kscc.sslio.dto.response;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.performClear;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class MBR0003ResponseDTO extends ResponseDTO {
    private Response response;

    public class Response {
        private String afcpApltNm;
        private String afltCd;
        private List<AfltMbrsDataV> afltMbrsDataV;
        private String afltStupYn;
        private String apltPckgNm;
        private String areaCd;
        private String atcgCtAmt;
        private String atcgLmtRestAmt;
        private String atcgYn;
        private String chgSchmCtt;
        private String cncnSchmCtt;
        private String crcmCd;
        private String crdtChecDvsCd;
        private String gndrCd;
        private String lmtModTgtYn;
        private String lockerYn;
        private String ppyDpyDvsCd;
        private String psbMbph;
        private String pymMnsGrpCd;
        private String pymStupYn;
        private String pynUsrYn;
        private String rspCd;
        private String rspMsg;
        private String samePartnerAfltYn;
        private String sttSchmCtt;
        private String tmCrcmCd;
        private String tstlRsnCd;
        private String ucfmYn;
        private String userBrdt;
        private String usrUseLtnCd;

        public class AfltMbrsDataV {
            public String mbrsCardStaCd;
            public String mbrsEfIdx;
            public String mbrsPrdId;

            public AfltMbrsDataV() {
            }

            public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
                jsonWriter.beginObject();
                onWarmupCompleted(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
                jsonWriter.endObject();
            }

            protected /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
                if (this != this.mbrsCardStaCd) {
                    defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 793);
                    jsonWriter.value(this.mbrsCardStaCd);
                }
                if (this != this.mbrsEfIdx) {
                    defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 573);
                    jsonWriter.value(this.mbrsEfIdx);
                }
                if (this != this.mbrsPrdId) {
                    defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 744);
                    jsonWriter.value(this.mbrsPrdId);
                }
            }

            public /* synthetic */ void onWarmupCompleted(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
                }
                jsonReader.endObject();
            }

            protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (i == 27) {
                    if (!z) {
                        this.mbrsEfIdx = null;
                        jsonReader.nextNull();
                        return;
                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.mbrsEfIdx = jsonReader.nextString();
                        return;
                    } else {
                        this.mbrsEfIdx = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                }
                if (i == 416) {
                    if (!z) {
                        this.mbrsCardStaCd = null;
                        jsonReader.nextNull();
                        return;
                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.mbrsCardStaCd = jsonReader.nextString();
                        return;
                    } else {
                        this.mbrsCardStaCd = Boolean.toString(jsonReader.nextBoolean());
                        return;
                    }
                }
                if (i != 836) {
                    jsonReader.skipValue();
                    return;
                }
                if (!z) {
                    this.mbrsPrdId = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                    this.mbrsPrdId = jsonReader.nextString();
                } else {
                    this.mbrsPrdId = Boolean.toString(jsonReader.nextBoolean());
                }
            }
        }

        public Response() {
        }

        public String getAfcpApltNm() {
            return this.afcpApltNm;
        }

        public String getAfltCd() {
            return this.afltCd;
        }

        public List<AfltMbrsDataV> getAfltMbrsV() {
            return this.afltMbrsDataV;
        }

        public String getAfltStupYn() {
            return this.afltStupYn;
        }

        public String getApltPckgNm() {
            return this.apltPckgNm;
        }

        public String getAreaCd() {
            return this.areaCd;
        }

        public String getAtcgCtAmt() {
            return this.atcgCtAmt;
        }

        public String getAtcgLmtRestAmt() {
            return this.atcgLmtRestAmt;
        }

        public String getAtcgYn() {
            return this.atcgYn;
        }

        public String getChgSchmCtt() {
            return this.chgSchmCtt;
        }

        public String getCncnSchmCtt() {
            return this.cncnSchmCtt;
        }

        public String getCrcmCd() {
            return this.crcmCd;
        }

        public String getCrdtChecDvsCd() {
            return this.crdtChecDvsCd;
        }

        public String getGndrCd() {
            return this.gndrCd;
        }

        public String getLmtModTgtYn() {
            return this.lmtModTgtYn;
        }

        public String getLockerYn() {
            return this.lockerYn;
        }

        public String getPpyDpyDvsCd() {
            return this.ppyDpyDvsCd;
        }

        public String getPsbMbph() {
            return this.psbMbph;
        }

        public String getPymMnsGrpCd() {
            return this.pymMnsGrpCd;
        }

        public String getPymStupYn() {
            return this.pymStupYn;
        }

        public String getPynUsrYn() {
            return this.pynUsrYn;
        }

        public String getRspCd() {
            return this.rspCd;
        }

        public String getRspMsg() {
            return this.rspMsg;
        }

        public String getSamePartnerAfltYn() {
            return this.samePartnerAfltYn;
        }

        public String getSttSchmCtt() {
            return this.sttSchmCtt;
        }

        public String getTmCrcmCd() {
            return this.tmCrcmCd;
        }

        public String getTstlRsnCd() {
            return this.tstlRsnCd;
        }

        public String getUcfmYn() {
            return this.ucfmYn;
        }

        public String getUserBrdt() {
            return this.userBrdt;
        }

        public String getUsrUseLtnCd() {
            return this.usrUseLtnCd;
        }

        public /* synthetic */ void onNavigationEvent(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            jsonWriter.beginObject();
            onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
            jsonWriter.endObject();
        }

        public void setAfcpApltNm(String str) {
            this.afcpApltNm = str;
        }

        public void setAfltCd(String str) {
            this.afltCd = str;
        }

        public void setAfltStupYn(String str) {
            this.afltStupYn = str;
        }

        public void setApltPckgNm(String str) {
            this.apltPckgNm = str;
        }

        public void setAreaCd(String str) {
            this.areaCd = str;
        }

        public void setAtcgCtAmt(String str) {
            this.atcgCtAmt = str;
        }

        public void setAtcgLmtRestAmt(String str) {
            this.atcgLmtRestAmt = str;
        }

        public void setAtcgYn(String str) {
            this.atcgYn = str;
        }

        public void setChgSchmCtt(String str) {
            this.chgSchmCtt = str;
        }

        public void setCncnSchmCtt(String str) {
            this.cncnSchmCtt = str;
        }

        public void setCrcmCd(String str) {
            this.crcmCd = str;
        }

        public void setCrdtChecDvsCd(String str) {
            this.crdtChecDvsCd = str;
        }

        public void setGndrCd(String str) {
            this.gndrCd = str;
        }

        public void setLmtModTgtYn(String str) {
            this.lmtModTgtYn = str;
        }

        public void setLockerYn(String str) {
            this.lockerYn = str;
        }

        public void setPpyDpyDvsCd(String str) {
            this.ppyDpyDvsCd = str;
        }

        public void setPsbMbph(String str) {
            this.psbMbph = str;
        }

        public void setPymMnsGrpCd(String str) {
            this.pymMnsGrpCd = str;
        }

        public void setPymStupYn(String str) {
            this.pymStupYn = str;
        }

        public void setPynUsrYn(String str) {
            this.pynUsrYn = str;
        }

        public void setRspCd(String str) {
            this.rspCd = str;
        }

        public void setRspMsg(String str) {
            this.rspMsg = str;
        }

        public void setSamePartnerAfltYn(String str) {
            this.samePartnerAfltYn = str;
        }

        public void setSttSchmCtt(String str) {
            this.sttSchmCtt = str;
        }

        public void setTmCrcmCd(String str) {
            this.tmCrcmCd = str;
        }

        public void setTstlRsnCd(String str) {
            this.tstlRsnCd = str;
        }

        public void setUcfmYn(String str) {
            this.ucfmYn = str;
        }

        public void setUserBrdt(String str) {
            this.userBrdt = str;
        }

        public void setUsrUseLtnCd(String str) {
            this.usrUseLtnCd = str;
        }

        protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
            if (this != this.afcpApltNm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 447);
                jsonWriter.value(this.afcpApltNm);
            }
            if (this != this.afltCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 45);
                jsonWriter.value(this.afltCd);
            }
            if (this != this.afltMbrsDataV) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 1);
                performClear performclear = new performClear();
                List<AfltMbrsDataV> list = this.afltMbrsDataV;
                DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, performclear, list).write(jsonWriter, list);
            }
            if (this != this.afltStupYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 712);
                jsonWriter.value(this.afltStupYn);
            }
            if (this != this.apltPckgNm) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 679);
                jsonWriter.value(this.apltPckgNm);
            }
            if (this != this.areaCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 771);
                jsonWriter.value(this.areaCd);
            }
            if (this != this.atcgCtAmt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 380);
                jsonWriter.value(this.atcgCtAmt);
            }
            if (this != this.atcgLmtRestAmt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 274);
                jsonWriter.value(this.atcgLmtRestAmt);
            }
            if (this != this.atcgYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 843);
                jsonWriter.value(this.atcgYn);
            }
            if (this != this.chgSchmCtt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 524);
                jsonWriter.value(this.chgSchmCtt);
            }
            if (this != this.cncnSchmCtt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 27);
                jsonWriter.value(this.cncnSchmCtt);
            }
            if (this != this.crcmCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 801);
                jsonWriter.value(this.crcmCd);
            }
            if (this != this.crdtChecDvsCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 296);
                jsonWriter.value(this.crdtChecDvsCd);
            }
            if (this != this.gndrCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 830);
                jsonWriter.value(this.gndrCd);
            }
            if (this != this.lmtModTgtYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 67);
                jsonWriter.value(this.lmtModTgtYn);
            }
            if (this != this.lockerYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 566);
                jsonWriter.value(this.lockerYn);
            }
            if (this != this.ppyDpyDvsCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 363);
                jsonWriter.value(this.ppyDpyDvsCd);
            }
            if (this != this.psbMbph) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 875);
                jsonWriter.value(this.psbMbph);
            }
            if (this != this.pymMnsGrpCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 725);
                jsonWriter.value(this.pymMnsGrpCd);
            }
            if (this != this.pymStupYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 373);
                jsonWriter.value(this.pymStupYn);
            }
            if (this != this.pynUsrYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 567);
                jsonWriter.value(this.pynUsrYn);
            }
            if (this != this.rspCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 482);
                jsonWriter.value(this.rspCd);
            }
            if (this != this.rspMsg) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 785);
                jsonWriter.value(this.rspMsg);
            }
            if (this != this.samePartnerAfltYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 760);
                jsonWriter.value(this.samePartnerAfltYn);
            }
            if (this != this.sttSchmCtt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 877);
                jsonWriter.value(this.sttSchmCtt);
            }
            if (this != this.tmCrcmCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 446);
                jsonWriter.value(this.tmCrcmCd);
            }
            if (this != this.tstlRsnCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 587);
                jsonWriter.value(this.tstlRsnCd);
            }
            if (this != this.ucfmYn) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 450);
                jsonWriter.value(this.ucfmYn);
            }
            if (this != this.userBrdt) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 147);
                jsonWriter.value(this.userBrdt);
            }
            if (this != this.usrUseLtnCd) {
                defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 73);
                jsonWriter.value(this.usrUseLtnCd);
            }
        }

        public /* synthetic */ void onExtraCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            }
            jsonReader.endObject();
        }

        protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (i) {
                case 1:
                    if (!z) {
                        this.afltStupYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.afltStupYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.afltStupYn = jsonReader.nextString();
                        break;
                    }
                case 31:
                    if (!z) {
                        this.pymMnsGrpCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.pymMnsGrpCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.pymMnsGrpCd = jsonReader.nextString();
                        break;
                    }
                case 60:
                    if (!z) {
                        this.afcpApltNm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.afcpApltNm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.afcpApltNm = jsonReader.nextString();
                        break;
                    }
                case 64:
                    if (!z) {
                        this.pymStupYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.pymStupYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.pymStupYn = jsonReader.nextString();
                        break;
                    }
                case 66:
                    if (!z) {
                        this.lockerYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.lockerYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.lockerYn = jsonReader.nextString();
                        break;
                    }
                case 81:
                    if (!z) {
                        this.tmCrcmCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.tmCrcmCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.tmCrcmCd = jsonReader.nextString();
                        break;
                    }
                case 121:
                    if (!z) {
                        this.cncnSchmCtt = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.cncnSchmCtt = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.cncnSchmCtt = jsonReader.nextString();
                        break;
                    }
                case 122:
                    if (!z) {
                        this.chgSchmCtt = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.chgSchmCtt = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.chgSchmCtt = jsonReader.nextString();
                        break;
                    }
                case 133:
                    if (!z) {
                        this.samePartnerAfltYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.samePartnerAfltYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.samePartnerAfltYn = jsonReader.nextString();
                        break;
                    }
                case 201:
                    if (!z) {
                        this.crcmCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.crcmCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.crcmCd = jsonReader.nextString();
                        break;
                    }
                case 227:
                    if (!z) {
                        this.rspCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.rspCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.rspCd = jsonReader.nextString();
                        break;
                    }
                case 323:
                    if (!z) {
                        this.crdtChecDvsCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.crdtChecDvsCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.crdtChecDvsCd = jsonReader.nextString();
                        break;
                    }
                case 356:
                    if (!z) {
                        this.gndrCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.gndrCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.gndrCd = jsonReader.nextString();
                        break;
                    }
                case 378:
                    if (!z) {
                        this.apltPckgNm = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.apltPckgNm = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.apltPckgNm = jsonReader.nextString();
                        break;
                    }
                case 383:
                    if (!z) {
                        this.tstlRsnCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.tstlRsnCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.tstlRsnCd = jsonReader.nextString();
                        break;
                    }
                case 385:
                    if (!z) {
                        this.rspMsg = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.rspMsg = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.rspMsg = jsonReader.nextString();
                        break;
                    }
                case 404:
                    if (!z) {
                        this.usrUseLtnCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.usrUseLtnCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.usrUseLtnCd = jsonReader.nextString();
                        break;
                    }
                case 478:
                    if (!z) {
                        this.lmtModTgtYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.lmtModTgtYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.lmtModTgtYn = jsonReader.nextString();
                        break;
                    }
                case 557:
                    if (!z) {
                        this.pynUsrYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.pynUsrYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.pynUsrYn = jsonReader.nextString();
                        break;
                    }
                case 577:
                    if (!z) {
                        this.sttSchmCtt = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.sttSchmCtt = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.sttSchmCtt = jsonReader.nextString();
                        break;
                    }
                case 596:
                    if (!z) {
                        this.afltMbrsDataV = null;
                        jsonReader.nextNull();
                        break;
                    } else {
                        this.afltMbrsDataV = (List) gson.getAdapter(new performClear()).read(jsonReader);
                        break;
                    }
                case 628:
                    if (!z) {
                        this.userBrdt = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.userBrdt = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.userBrdt = jsonReader.nextString();
                        break;
                    }
                case 666:
                    if (!z) {
                        this.ucfmYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.ucfmYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.ucfmYn = jsonReader.nextString();
                        break;
                    }
                case 728:
                    if (!z) {
                        this.ppyDpyDvsCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.ppyDpyDvsCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.ppyDpyDvsCd = jsonReader.nextString();
                        break;
                    }
                case 742:
                    if (!z) {
                        this.atcgCtAmt = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.atcgCtAmt = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.atcgCtAmt = jsonReader.nextString();
                        break;
                    }
                case 767:
                    if (!z) {
                        this.areaCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.areaCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.areaCd = jsonReader.nextString();
                        break;
                    }
                case 782:
                    if (!z) {
                        this.atcgLmtRestAmt = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.atcgLmtRestAmt = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.atcgLmtRestAmt = jsonReader.nextString();
                        break;
                    }
                case 801:
                    if (!z) {
                        this.afltCd = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.afltCd = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.afltCd = jsonReader.nextString();
                        break;
                    }
                case 817:
                    if (!z) {
                        this.psbMbph = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.psbMbph = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.psbMbph = jsonReader.nextString();
                        break;
                    }
                case 823:
                    if (!z) {
                        this.atcgYn = null;
                        jsonReader.nextNull();
                        break;
                    } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                        this.atcgYn = Boolean.toString(jsonReader.nextBoolean());
                        break;
                    } else {
                        this.atcgYn = jsonReader.nextString();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public Response getResponse() {
        return this.response;
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        if (this != this.response) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 280);
            Response response = this.response;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Response.class, response).write(jsonWriter, response);
        }
        asInterface(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 231) {
            IAuthTabCallbackStub(gson, jsonReader, i);
        } else if (z) {
            this.response = (Response) gson.getAdapter(Response.class).read(jsonReader);
        } else {
            this.response = null;
            jsonReader.nextNull();
        }
    }
}
