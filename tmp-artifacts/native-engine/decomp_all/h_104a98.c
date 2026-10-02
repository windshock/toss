// entry=0x104a98

void H104910(int param_1)

{
  uint uVar1;
  undefined **ppuVar2;
  uint uVar3;
  long lVar4;
  char cVar5;
  undefined4 in_w6;
  int iVar6;
  long unaff_x29;
  undefined4 uStack000000000000000c;
  
  uVar1 = (DAT_00274eb8 ^ 0xfffffffe) & DAT_00274eb8;
  uVar1 = uVar1 | uVar1 ^ 0xffffffff;
  DAT_00274eb8 = DAT_00274eb8 & uVar1 | DAT_00274eb8 ^ uVar1;
  DAT_002862c0 = 0;
  iVar6 = (int)DAT_00278630;
  if (param_1 == 0) {
    uStack000000000000000c = in_w6;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar6 | 0xf5eef27eU) + (-iVar6 & 0xf5eef27eU)) * 0x2b +
               (long)(int)(-0xa110d59 - (-iVar6 ^ 0xffffffffU))])();
    uVar1 = -(int)DAT_00278630;
    uVar3 = -(int)DAT_00278630;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar3 | 0xf5eef27e) + (uVar3 & 0xf5eef27e)) * 0x2b +
               (long)(int)((uVar1 | 0xf5eef292) * 2 - (uVar1 ^ 0xf5eef292))])();
    uVar1 = -(int)DAT_00278630;
    uVar3 = -(int)DAT_00278630;
    cVar5 = (*(code *)(&DAT_0029e620)
                      [(long)(int)((uVar3 | 0xf5eef27e) * 2 - (uVar3 ^ 0xf5eef27e)) * 0x2b +
                       (long)(int)((uVar1 | 0xf5eef2a4) + (uVar1 & 0xf5eef2a4))])();
    ppuVar2 = &PTR_LAB_00282dc0;
    if (cVar5 != (byte)((-(char)DAT_00278630 | 0x7eU) + (-(char)DAT_00278630 & 0x7eU))) {
      ppuVar2 = &PTR_LAB_0027ea68;
    }
                    /* WARNING: Could not recover jumptable at 0x00205354. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)(0);
    return;
  }
  (*(code *)(&DAT_0029e620)
            [(long)(int)((-iVar6 ^ 0xf5eef27eU) + (-iVar6 & 0xf5eef27eU) * 2) * 0x2b +
             (long)(int)((-iVar6 | 0xf5eef2a8U) * 2 - (-iVar6 ^ 0xf5eef2a8U))])();
  uVar1 = -(int)DAT_00278630;
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0xa110d83 - (-(int)DAT_00278630 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((uVar1 | 0xf5eef292) * 2 - (uVar1 ^ 0xf5eef292))])();
  uVar1 = -(int)DAT_00278630;
  uVar3 = -(int)DAT_00278630;
  cVar5 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar1 ^ 0xf5eef27e) + (uVar1 & 0xf5eef27e) * 2) * 0x2b +
                     (long)(int)((uVar3 | 0xf5eef2a4) + (uVar3 & 0xf5eef2a4))])();
  iVar6 = (int)DAT_00278630;
  if (cVar5 == '\0') {
    (*(code *)(&DAT_0029e620)
              [(long)(int)((-iVar6 | 0xf5eef27eU) * 2 - (-iVar6 ^ 0xf5eef27eU)) * 0x2b +
               (long)(int)((-iVar6 ^ 0xf5eef28dU) + (-iVar6 & 0xf5eef28dU) * 2)])();
                    /* WARNING: Could not recover jumptable at 0x0020414c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_0027d400)
              [(long)(int)((-(int)DAT_00278630 | 0xf5eef27eU) + (-(int)DAT_00278630 & 0xf5eef27eU))
               * 0x49])();
    return;
  }
  (*(code *)(&DAT_0029e620)
            [(long)(int)((-iVar6 | 0xf5eef27eU) + (-iVar6 & 0xf5eef27eU)) * 0x2b +
             (long)(int)((-iVar6 | 0xf5eef2a8U) + (-iVar6 & 0xf5eef2a8U))])();
  uVar1 = -(int)DAT_00278630;
  uVar3 = -(int)DAT_00278630;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar3 | 0xf5eef27e) * 2 - (uVar3 ^ 0xf5eef27e)) * 0x2b +
             (long)(int)((uVar1 | 0xf5eef292) + (uVar1 & 0xf5eef292))])();
  uVar1 = -(int)DAT_00278630;
  uVar3 = -(int)DAT_00278630;
  cVar5 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar3 | 0xf5eef27e) * 2 - (uVar3 ^ 0xf5eef27e)) * 0x2b +
                     (long)(int)((uVar1 | 0xf5eef2a4) + (uVar1 & 0xf5eef2a4))])();
  if (cVar5 == '\0') {
    uVar1 = -(int)DAT_00278630;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 | 0xf5eef27e) * 2 - (uVar1 ^ 0xf5eef27e)) * 0x2b +
               (long)(int)(-0xa110d5e - (-(int)DAT_00278630 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x002051a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275670)();
    return;
  }
  lVar4 = tpidr_el0;
  if (*(long *)(lVar4 + 0x28) == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


