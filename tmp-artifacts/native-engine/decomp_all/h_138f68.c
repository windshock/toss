// entry=0x138f68

void H138f68(undefined8 param_1,int param_2)

{
  uint uVar1;
  byte *pbVar2;
  ulong uVar3;
  undefined **ppuVar4;
  char cVar5;
  long lVar6;
  byte bVar7;
  bool bVar8;
  ulong uVar9;
  byte bVar10;
  uint uVar11;
  uint uVar12;
  ulong in_x13;
  char in_w15;
  long in_x16;
  uint in_w17;
  undefined8 *unaff_x29;
  
  if (param_2 != 0xf2d8228) {
    *(undefined8 *)(((ulong)unaff_x29 | 8) + ((ulong)unaff_x29 & 8)) = 0x18;
    *unaff_x29 = 0x18;
    lVar6 = tpidr_el0;
    if (*(long *)(lVar6 + 0x28) == unaff_x29[-0xc]) {
      return;
    }
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  uVar9 = 0;
  bVar10 = 0;
  do {
    (&stack0x000005f0)[uVar9] = bVar10;
    uVar9 = (uVar9 ^ 1) + (uVar9 & 1) * 2;
    bVar10 = (bVar10 ^ 1) + (bVar10 & 1) * '\x02';
  } while (uVar9 != 0x100);
  uVar9 = 0;
  uVar11 = 0;
  do {
    uVar11 = (uVar11 ^ 0xffffff00) & uVar11;
    bVar10 = (&stack0x000005f0)[uVar9];
    uVar11 = (uVar11 | bVar10) + (uVar11 & bVar10);
    uVar11 = (uVar11 | (byte)(&DAT_0012cd2f)[uVar9 % 0xe]) * 2 -
             (uVar11 ^ (byte)(&DAT_0012cd2f)[uVar9 % 0xe]);
    (&stack0x000005f0)[uVar9] = (&stack0x000005f0)[(uVar11 ^ 0xffffff00) & uVar11];
    (&stack0x000005f0)[(uVar11 ^ 0xffffff00) & uVar11] = bVar10;
    uVar9 = (uVar9 ^ 1) + (uVar9 & 1) * 2;
  } while (uVar9 != 0x100);
  uVar12 = 0;
  uVar9 = 0;
  uVar11 = 0;
  do {
    uVar11 = (uVar11 ^ 0xffffff00) & uVar11;
    uVar1 = (-(int)DAT_00279eb0 ^ 0x8692047U) + (-(int)DAT_00279eb0 & 0x8692047U) * 2;
    uVar11 = (uVar11 ^ uVar1) + (uVar11 & uVar1) * 2;
    uVar12 = (uVar12 ^ 0xffffff00) & uVar12;
    pbVar2 = &stack0x000005f0 + ((uVar11 ^ 0xffffff00) & uVar11);
    bVar10 = *pbVar2;
    uVar12 = (uVar12 ^ bVar10) + (uVar12 & bVar10) * 2;
    *pbVar2 = (&stack0x000005f0)[(uVar12 ^ 0xffffff00) & uVar12];
    (&stack0x000005f0)[(uVar12 ^ 0xffffff00) & uVar12] = bVar10;
    bVar7 = (*pbVar2 | bVar10) + (*pbVar2 & bVar10);
    bVar10 = *(byte *)((long)&DAT_00283608 + uVar9);
    *(byte *)((long)&DAT_00283608 + uVar9) = (bVar10 | bVar7) & (bVar10 & bVar7 ^ 0xff);
    uVar3 = (-DAT_00279eb0 ^ 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U) * 2;
    uVar9 = (uVar9 | uVar3) * 2 - (uVar9 ^ uVar3);
  } while (uVar9 != 9);
  DAT_0029e5ec = 0;
  uVar11 = 0xffffffff - ((uint)DAT_00279eb0 & 1);
  if ((((uint)(in_w15 == '%') ^ (in_w17 | uVar11) & (in_w17 & uVar11 ^ 1) ^ 1) &
      (uint)(in_w15 == '%')) == 0) {
    (&stack0x000001bc)[in_x13] = in_w15;
    uVar9 = (-DAT_00279eb0 ^ 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U) * 2;
    bVar8 = (in_x13 | uVar9) * 2 - (in_x13 ^ uVar9) <
            0x3f63e72908692145 - (-DAT_00279eb0 ^ 0xffffffffffffffffU);
    ppuVar4 = &PTR_LAB_0027ed80;
    if (bVar8 == (*(char *)(in_x16 + (-DAT_00279eb0 | 0x3f63e72908692047U) +
                                     (-DAT_00279eb0 & 0x3f63e72908692047U)) ==
                 (byte)('E' - (-(char)DAT_00279eb0 ^ 0xffU))) || !bVar8) {
      ppuVar4 = &PTR_LAB_00282a38;
    }
                    /* WARNING: Could not recover jumptable at 0x00238dc8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar4)();
    return;
  }
  do {
    if (DAT_00286268 != 0) {
      ClearExclusiveLocal();
      bVar8 = false;
      goto LAB_00238554;
    }
    cVar5 = '\x01';
    bVar8 = (bool)ExclusiveMonitorPass(0x286268,0x10);
    if (bVar8) {
      DAT_00286268 = 1;
      cVar5 = ExclusiveMonitorsStatus();
    }
  } while (cVar5 != '\0');
  bVar8 = true;
LAB_00238554:
  ppuVar4 = &PTR_LAB_00283f60;
  if (!bVar8) {
    ppuVar4 = &PTR_LAB_00274b28;
  }
                    /* WARNING: Could not recover jumptable at 0x00239a3c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)(param_1,*(undefined1 *)(in_x16 + 1));
  return;
}


