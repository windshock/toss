// entry=0x1532e8

void H15297c(char *param_1)

{
  ulong uVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  undefined8 *puVar6;
  char *pcVar7;
  undefined8 uVar8;
  long lVar9;
  undefined **in_x5;
  char *pcVar10;
  long unaff_x19;
  byte *pbVar11;
  uint unaff_w21;
  long unaff_x22;
  uint unaff_w23;
  long unaff_x24;
  long *unaff_x25;
  ulong unaff_x28;
  
  uVar8 = DAT_0029e508;
  puVar6 = DAT_0029e4f0;
  uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  pcVar7 = param_1;
  if ((uint)*(byte *)(unaff_x24 + 0x62) == ((uVar3 ^ 0x89) + (uVar3 & unaff_w21) * 2 & 0xff)) {
    do {
      pcVar10 = pcVar7;
      pcVar7 = pcVar10 + 1;
    } while (*pcVar10 != '\0');
    ppuVar2 = (undefined **)&DAT_0027d9e0;
    if (pcVar10 != param_1) {
      ppuVar2 = &PTR_LAB_002809e0;
    }
                    /* WARNING: Could not recover jumptable at 0x00253b60. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  DAT_0029e4e8 = 1;
  uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  *(undefined8 *)(unaff_x19 + 0x38) = DAT_0029e500;
  DAT_0029e540 = (uVar3 | 0x6fa01027) * 2 - (uVar3 ^ 0x6fa01027);
  if (puVar6 != (undefined8 *)0x0) {
    *(undefined8 **)(unaff_x19 + 0x18) = puVar6;
    *(undefined8 *)(unaff_x19 + 0x20) = uVar8;
    uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    (*(code *)in_x5[(long)(int)((unaff_w23 ^ uVar4) + (unaff_w23 & uVar4) * 2) * 300 +
                    (long)(int)((unaff_w23 + 0x50 | uVar3) + (unaff_w23 + 0x50 & uVar3))])(*puVar6);
    uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
    (*(code *)in_x5[(long)(int)((uVar3 | 0x143a5e89) + (uVar3 & 0x143a5e89)) * 300 +
                    (long)(0x143a5ed9 - (int)*(undefined8 *)(unaff_x22 + 0x260))])
              (*(undefined8 *)(unaff_x19 + 0x18));
    uVar8 = *(undefined8 *)(unaff_x19 + 0x20);
    unaff_w23 = 0x143a5e89;
    in_x5 = &PTR_FUN_0027c1e0;
  }
  uVar3 = unaff_w23 + 0x50;
  uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  (*(code *)in_x5[(long)(int)(unaff_w23 - (int)*(undefined8 *)(unaff_x22 + 0x260)) * 300 +
                  (long)(int)((uVar3 | uVar4) + (uVar3 & uVar4))])(uVar8);
  uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  uVar5 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  (*(code *)in_x5[(long)(int)((uVar5 | 0x143a5e89) * 2 - (uVar5 ^ 0x143a5e89)) * 300 +
                  (long)(int)((uVar3 | uVar4) + (uVar3 & uVar4))])
            (*(undefined8 *)(unaff_x19 + 0x38));
  pbVar11 = *(byte **)(unaff_x24 + 0x20);
  uVar3 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  uVar4 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
  lVar9 = (*(code *)in_x5[(long)(int)((uVar3 | 0x143a5e89) + (uVar3 & 0x143a5e89)) * 300 +
                          (long)(int)((uVar4 ^ 0x143a5f9e) + (uVar4 & 0x143a5f9e) * 2)])
                    ((unaff_x28 - *(long *)(unaff_x22 + 0x260)) + 0xb7);
  if (lVar9 == 0) {
    ppuVar2 = (undefined **)
              (&DAT_0027b450 + (long)(0x143a5e89 - (int)*(undefined8 *)(unaff_x22 + 0x260)) * 0x388)
    ;
    if ((uint)*pbVar11 != (-(int)*(undefined8 *)(unaff_x22 + 0x260) - 0x77U & 0xff)) {
      ppuVar2 = &PTR_LAB_00276468;
    }
    DAT_0029e4f0 = (undefined8 *)lVar9;
                    /* WARNING: Could not recover jumptable at 0x00253908. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)((unaff_x28 | -*(long *)(unaff_x22 + 0x260)) * 2 -
                        (unaff_x28 ^ -*(long *)(unaff_x22 + 0x260)));
    return;
  }
  *(long *)(unaff_x19 + 0x30) = lVar9;
  *(byte **)(unaff_x19 + 0x48) = pbVar11;
  uVar1 = (-*(long *)(unaff_x22 + 0x260) ^ 0x8032e68a143a5e89U) +
          (-*(long *)(unaff_x22 + 0x260) & 0x8032e68a143a5e89U) * 2;
  ppuVar2 = &PTR_LAB_0027d7d8;
  if (*(char *)(*unaff_x25 + uVar1) != '\0') {
    ppuVar2 = &PTR_LAB_00282d28;
  }
                    /* WARNING: Could not recover jumptable at 0x00252bfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)((uVar1 | 1) + (uVar1 & 1));
  return;
}


