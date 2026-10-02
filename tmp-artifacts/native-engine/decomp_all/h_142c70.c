// entry=0x142c70

void H142608(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  char cVar4;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00275280;
  (*(code *)(&DAT_0029e620)
            [(long)(int)(0x7d3edd2e - (-(int)DAT_00275280 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((uVar1 | 0x7d3edd59) + (uVar1 & 0x7d3edd59))])();
  uVar1 = -(int)DAT_00275280;
  uVar2 = -(int)DAT_00275280;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0x7d3edd2f) + (uVar2 & 0x7d3edd2f)) * 0x2b +
             (long)(int)((uVar1 | 0x7d3edd43) + (uVar1 & 0x7d3edd43))])();
  uVar1 = -(int)DAT_00275280;
  cVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)(0x7d3edd2e - (-(int)DAT_00275280 ^ 0xffffffffU)) * 0x2b +
                     (long)(int)((uVar1 | 0x7d3edd55) + (uVar1 & 0x7d3edd55))])();
  if (cVar4 == (byte)('.' - (-(char)DAT_00275280 ^ 0xffU))) {
    uVar1 = -(int)DAT_00275280;
                    /* WARNING: Could not recover jumptable at 0x00242f74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027d0b8)
              ((&DAT_0029e620)
               [(long)(int)((uVar1 | 0x7d3edd2f) * 2 - (uVar1 ^ 0x7d3edd2f)) * 0x2b +
                (long)(int)(0x7d3edd53 - (-(int)DAT_00275280 ^ 0xffffffffU))]);
    return;
  }
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


