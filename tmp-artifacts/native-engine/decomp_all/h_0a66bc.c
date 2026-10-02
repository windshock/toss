// entry=0xa66bc

void thunk_FUN_001a66c0(undefined8 param_1,byte param_2,int param_3)

{
  byte *pbVar1;
  byte *pbVar2;
  undefined **ppuVar3;
  char cVar4;
  byte bVar5;
  byte bVar6;
  bool bVar7;
  long lVar8;
  ulong uVar9;
  uint uVar10;
  uint uVar11;
  byte in_w12;
  uint in_w13;
  ulong in_x14;
  long in_x16;
  char in_w17;
  long unaff_x19;
  long unaff_x25;
  undefined8 *unaff_x29;
  
  if (-0x3d7a2d0b - (-(int)DAT_0027fb18 ^ 0xffffffffU) != param_3) {
    *(undefined8 *)(((ulong)unaff_x29 | 8) * 2 - ((ulong)unaff_x29 ^ 8)) = 8;
    *unaff_x29 = 0x28;
    lVar8 = tpidr_el0;
    if (*(long *)(lVar8 + 0x28) != unaff_x29[-0xc]) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  uVar9 = 0;
  bVar5 = 0;
  do {
    *(byte *)(unaff_x19 + 0x530 + uVar9) = bVar5;
    uVar9 = (uVar9 | 1) + (uVar9 & 1);
    bVar5 = (bVar5 | 1) * '\x02' - (bVar5 ^ 1);
  } while (uVar9 != 0x100);
  uVar9 = 0;
  uVar10 = 0;
  do {
    uVar10 = (uVar10 ^ 0x56e408be - (-(int)DAT_0027fb18 ^ 0xffffffffU) ^ 0xffffffff) & uVar10;
    pbVar1 = (byte *)(unaff_x19 + 0x530 + uVar9);
    bVar5 = *pbVar1;
    uVar10 = (((uVar10 | bVar5) * 2 - (uVar10 ^ bVar5)) -
             ((byte)(&DAT_0012ccee)[uVar9 % 0xf] ^ 0xffffffff)) - 1;
    pbVar2 = (byte *)(unaff_x19 + 0x530 + (ulong)((uVar10 ^ 0xffffff00) & uVar10));
    *pbVar1 = *pbVar2;
    *pbVar2 = bVar5;
    uVar9 = uVar9 + 1;
  } while (uVar9 != 0x100);
  uVar11 = 0;
  uVar9 = 0;
  uVar10 = 0;
  do {
    uVar10 = ((uVar10 ^ 0xffffff00) & uVar10) + 1;
    pbVar1 = (byte *)(unaff_x19 + 0x530 + (ulong)((uVar10 ^ 0xffffff00) & uVar10));
    bVar5 = *pbVar1;
    uVar11 = (((uVar11 ^ 0xffffff00) & uVar11) - (bVar5 ^ 0xffffffff)) - 1;
    pbVar2 = (byte *)(unaff_x19 + 0x530 + (ulong)((uVar11 ^ 0xffffff00) & uVar11));
    *pbVar1 = *pbVar2;
    *pbVar2 = bVar5;
    bVar5 = (*pbVar1 ^ bVar5) + (*pbVar1 & bVar5) * '\x02';
    bVar6 = (&DAT_0027ad10)[uVar9];
    (&DAT_0027ad10)[uVar9] = (bVar6 ^ 0xff) & bVar5 | bVar6 & (bVar5 ^ 0xff);
    uVar9 = (uVar9 | 1) * 2 - (uVar9 ^ 1);
  } while (uVar9 != 0x10);
  DAT_00285da8 = 0;
  DAT_00286268 = 0;
  if (((in_w17 == '%' ^ param_2 ^ 1) & in_w17 == '%') == 0) {
    *(char *)(unaff_x25 + in_x14) = in_w17;
                    /* WARNING: Could not recover jumptable at 0x0019a90c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027ee40)();
    return;
  }
  cVar4 = *(char *)(in_x16 + 1);
  switch(cVar4) {
  case 'd':
  case 'x':
    uVar11 = -(int)DAT_0027fb18;
    uVar10 = 10;
    if (cVar4 != 'd') {
      uVar10 = (uVar11 ^ 0x56e407d0) + (uVar11 & 0x56e407d0) * 2;
    }
    if (((in_w12 ^ cVar4 != 'd') & in_w12 & 1) == 0) {
      in_w13 = (uint)param_1;
    }
    else {
      *(undefined1 *)(unaff_x25 + in_x14) = 0x2d;
      bVar7 = 0x3fe < in_x14;
      in_x14 = (-DAT_0027fb18 ^ 0x2e00d84656e40bbfU) + (-DAT_0027fb18 & 0x2e00d84656e40bbfU) * 2;
      if (bVar7) break;
    }
    uVar9 = (-DAT_0027fb18 | 0x2e00d84656e407c0U) * 2 - (-DAT_0027fb18 ^ 0x2e00d84656e407c0U);
    uVar11 = 0;
    if (uVar10 != 0) {
      uVar11 = in_w13 / uVar10;
    }
    *(undefined1 *)(*(long *)(unaff_x19 + 0x270) + uVar9) =
         (&DAT_0027ad10)[(in_w13 | -(uVar11 * uVar10)) + (in_w13 & -(uVar11 * uVar10))];
    ppuVar3 = &PTR_LAB_0027bc18;
    if (uVar10 <= in_w13) {
      ppuVar3 = &PTR_LAB_0027fe98;
    }
                    /* WARNING: Could not recover jumptable at 0x001ae5ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar3)(param_1,uVar11,(uVar9 ^ 1) + (uVar9 & 1) * 2);
    return;
  default:
    if (in_x14 < 0x400 != (*(char *)(in_x16 + 2) == (byte)(-0x41 - (-(char)DAT_0027fb18 ^ 0xffU)))
        && in_x14 < 0x400) {
LAB_0019c9d8:
      do {
        if (DAT_0029e5f4 == 0) {
          cVar4 = '\x01';
          bVar7 = (bool)ExclusiveMonitorPass(0x29e5f4,0x10);
          if (bVar7) {
            DAT_0029e5f4 = 1;
            cVar4 = ExclusiveMonitorsStatus();
          }
          if (cVar4 != '\0') goto LAB_0019c9d8;
          bVar7 = true;
        }
        else {
          ClearExclusiveLocal();
          bVar7 = false;
        }
        if (bVar7) {
          bVar5 = *(byte *)(unaff_x19 + 0x316);
          *(undefined1 *)(unaff_x19 + 0x316) = 1;
          uVar10 = (-(int)DAT_0027fb18 ^ 0x56e407c0U) + (-(int)DAT_0027fb18 & 0x56e407c0U) * 2;
          if ((bVar5 & 1) == 0) {
            uVar10 = 1;
          }
          DAT_002862a4 = (DAT_002862a4 | uVar10) + (DAT_002862a4 & uVar10);
                    /* WARNING: Could not recover jumptable at 0x001a1728. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR_LAB_00277508)();
          return;
        }
      } while( true );
    }
    if (0x3fe < in_x14) {
      in_x14 = 0x3ff;
    }
    break;
  case 'l':
    uVar10 = -(int)DAT_0027fb18;
                    /* WARNING: Could not recover jumptable at 0x001a8a98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_00276dd8)[(int)((uVar10 ^ 0x56e407e7) + (uVar10 & 0x56e407e7) * 2)])();
    return;
  case 's':
                    /* WARNING: Could not recover jumptable at 0x001ad4c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027b890)();
    return;
  }
  *(undefined1 *)(unaff_x25 + in_x14) = 0;
  CallSupervisor(0);
  ppuVar3 = &PTR_LAB_0027d2a0;
  if ((ulong)((long)((-DAT_0027fb18 | 0x2e00d84656e4075cU) + (-DAT_0027fb18 & 0x2e00d84656e4075cU)
                    << (DAT_0027fb18 * -2 - (-DAT_0027fb18 ^ 0x7e0U) & 0x3f)) >> 0x20) <
      0xfffffffffffff001) {
    ppuVar3 = (undefined **)&DAT_00282cb8;
  }
                    /* WARNING: Could not recover jumptable at 0x0019aaa4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)();
  return;
}


