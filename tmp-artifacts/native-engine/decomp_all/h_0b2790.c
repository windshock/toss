// entry=0xb2790

undefined8 Hb2710(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  char cVar4;
  undefined8 uVar5;
  int iVar6;
  int unaff_w25;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 ^ 0x115f9427) + (uVar2 & 0x115f9427) * 2) * 0x2b +
             (long)(int)((uVar1 | 0x115f944c) * 2 - (uVar1 ^ 0x115f944c))])();
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 | 0x115f9427) + (uVar1 & 0x115f9427)) * 0x2b +
             (long)(int)((uVar2 | 0x115f9451) * 2 - (uVar2 ^ 0x115f9451))])();
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 ^ 0x115f9427) + (uVar2 & 0x115f9427) * 2) * 0x2b +
             (long)(int)((uVar1 | 0x115f943b) * 2 - (uVar1 ^ 0x115f943b))])();
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  cVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar1 ^ 0x115f9427) + (uVar1 & 0x115f9427) * 2) * 0x2b +
                     (long)(int)((uVar2 | 0x115f944d) + (uVar2 & 0x115f944d))])();
  if (cVar4 == '\0') {
    uVar1 = -(int)DAT_00280830;
    uVar2 = -(int)DAT_00280830;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar2 ^ 0x115f9427) + (uVar2 & 0x115f9427) * 2) * 0x2b +
               (long)(int)((uVar1 | 0x115f9442) + (uVar1 & 0x115f9442))])();
  }
  iVar6 = (int)DAT_00280830;
  if (unaff_w25 != 0) {
                    /* WARNING: Could not recover jumptable at 0x001b4814. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar5 = (*(code *)PTR_LAB_0027fa48)
                      (&DAT_0029e620 +
                       (long)(int)((-iVar6 ^ 0x115f9427U) + (-iVar6 & 0x115f9427U) * 2) * 0x2b +
                       (long)(int)((-iVar6 | 0x115f9451U) + (-iVar6 & 0x115f9451U)));
    return uVar5;
  }
  (*(code *)(&DAT_0029e620)
            [(long)(int)(0x115f9426 - (-iVar6 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((-iVar6 | 0x115f942eU) * 2 - (-iVar6 ^ 0x115f942eU))])();
  uVar1 = -(int)DAT_00280830;
  uVar2 = -(int)DAT_00280830;
  cVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar1 | 0x115f9427) * 2 - (uVar1 ^ 0x115f9427)) * 0x2b +
                     (long)(int)((uVar2 | 0x115f944d) + (uVar2 & 0x115f944d))])();
  if (cVar4 == (byte)('&' - (-(char)DAT_00280830 ^ 0xffU))) {
    uVar1 = -(int)DAT_00280830;
    uVar2 = -(int)DAT_00280830;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar2 ^ 0x115f9427) + (uVar2 & 0x115f9427) * 2) * 0x2b +
               (long)(int)((uVar1 | 0x115f942a) + (uVar1 & 0x115f942a))])();
                    /* WARNING: Could not recover jumptable at 0x001b32e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar5 = (*(code *)PTR_LAB_00285d18)();
    return uVar5;
  }
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return 0;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


