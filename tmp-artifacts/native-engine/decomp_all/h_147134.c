// entry=0x147134

void H1457d4(long *param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  undefined **ppuVar1;
  char cVar2;
  char cVar3;
  undefined8 *in_x9;
  undefined8 *in_x10;
  char *in_x11;
  long lVar4;
  char *in_x12;
  long in_x13;
  char *pcVar5;
  ulong in_x14;
  ulong uVar6;
  char *pcVar7;
  undefined8 uVar8;
  
  pcVar7 = in_x11;
  if (*in_x11 == *in_x12) {
    do {
      if (in_x13 == 0) {
        while (in_x11 == (char *)0x0) {
          do {
            param_1 = *(long **)((long)param_1 +
                                (-0x53392807ccca694b - (-DAT_00279b20 ^ 0xffffffffffffffffU)));
            if (param_1 == (long *)0x0) goto LAB_00247134;
            lVar4 = *param_1;
            in_x10 = (undefined8 *)(lVar4 + 0x3c);
          } while (*(int *)(lVar4 + 0x3c) != 0);
          in_x11 = *(char **)(lVar4 + 0x20);
          pcVar7 = (char *)*in_x9;
          do {
            pcVar5 = pcVar7;
            pcVar7 = pcVar5 + (-DAT_00279b20 | 0xacc6d7f8333596afU) +
                              (-DAT_00279b20 & 0xacc6d7f8333596afU);
          } while (*pcVar5 != '\0');
          uVar6 = -(long)*in_x9;
          if (((ulong)pcVar5 ^ uVar6) + ((ulong)pcVar5 & uVar6) * 2 != 0) {
            do {
              cVar2 = *in_x11;
              in_x11 = in_x11 + 1;
            } while (cVar2 != '\0');
                    /* WARNING: Could not recover jumptable at 0x002470ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)(&PTR_LAB_002747d8)
                      [(int)((-(int)DAT_00279b20 ^ 0x333596d3U) +
                            (-(int)DAT_00279b20 & 0x333596d3U) * 2)])();
            return;
          }
        }
        uVar8 = NEON_rev64(*(undefined8 *)(param_4 + 0x10),4);
        *in_x10 = uVar8;
LAB_00247134:
                    /* WARNING: Could not recover jumptable at 0x00247140. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR_LAB_00282df0)();
        return;
      }
      in_x13 = in_x13 + -1;
      cVar2 = *pcVar7;
      cVar3 = *in_x12;
      in_x12 = in_x12 + 1;
      pcVar7 = pcVar7 + 1;
    } while (cVar2 == cVar3);
  }
  ppuVar1 = &PTR_LAB_00281b08;
  if ((in_x14 ^ 0xffffffffffffffff) + in_x14 * 2 != 0) {
    ppuVar1 = &PTR_LAB_00275428;
  }
                    /* WARNING: Could not recover jumptable at 0x00246ba0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


