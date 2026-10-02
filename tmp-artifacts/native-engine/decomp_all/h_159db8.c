// entry=0x159db8

void H159db8(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  long unaff_x19;
  void *unaff_x22;
  ulong uVar5;
  int unaff_w24;
  long unaff_x25;
  
  uVar5 = 0;
  do {
    uVar2 = -(int)DAT_00285720;
    uVar3 = -(int)DAT_00285720;
    uVar4 = (*(code *)(&DAT_0029e620)
                      [(long)(int)((uVar3 ^ 0x4b98a2a0) + (uVar3 & 0x4b98a2a0) * 2) * 0x2b +
                       (long)(int)((uVar2 | 0x4b98a2b2) + (uVar2 & 0x4b98a2b2))])();
    *(undefined8 *)(unaff_x25 + uVar5 * 8) = uVar4;
    uVar2 = -(int)DAT_00285720;
    uVar3 = -(int)DAT_00285720;
    uVar4 = (*(code *)(&DAT_0029e620)
                      [(long)(int)((uVar3 ^ 0x4b98a2a0) + (uVar3 & 0x4b98a2a0) * 2) * 0x2b +
                       (long)(int)((uVar2 ^ 0x4b98a2c9) + (uVar2 & 0x4b98a2c9) * 2)])();
    *(undefined8 *)(*(long *)(unaff_x19 + 0x60) + uVar5 * 8) = uVar4;
    uVar5 = (uVar5 | 1) + (uVar5 & 1);
  } while ((long)uVar5 < (long)unaff_w24);
  memset(unaff_x22,0,0x18);
  uVar2 = -(int)DAT_00285720;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0x4b98a2a0) * 2 - (uVar2 ^ 0x4b98a2a0)) * 300 +
             (long)(int)(0x4b98a365 - (-(int)DAT_00285720 ^ 0xffffffffU))])(2);
  uVar2 = -(int)DAT_00285720;
  uVar3 = -(int)DAT_00285720;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 | 0x4b98a2a0) + (uVar3 & 0x4b98a2a0)) * 300 +
             (long)(int)((uVar2 | 0x4b98a38a) * 2 - (uVar2 ^ 0x4b98a38a))])();
  ppuVar1 = &PTR_LAB_00275148;
  if (*(int *)((long)unaff_x22 + 8) != 0) {
    ppuVar1 = &PTR_LAB_0027aa38;
  }
                    /* WARNING: Could not recover jumptable at 0x0025d518. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


