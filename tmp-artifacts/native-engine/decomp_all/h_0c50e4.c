// entry=0xc50e4

void Hc50e4(undefined8 *param_1)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  char cVar4;
  long unaff_x29;
  
  (*(code *)*param_1)();
  uVar1 = -(int)DAT_00275250;
  uVar2 = -(int)DAT_00275250;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 ^ 0x330208ce) + (uVar1 & 0x330208ce) * 2) * 0x2b +
             (long)(int)((uVar2 ^ 0x330208f8) + (uVar2 & 0x330208f8) * 2)])();
  uVar1 = -(int)DAT_00275250;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 | 0x330208ce) + (uVar1 & 0x330208ce)) * 0x2b +
             (long)(int)(0x330208e1 - (-(int)DAT_00275250 ^ 0xffffffffU))])();
  uVar1 = -(int)DAT_00275250;
  uVar2 = -(int)DAT_00275250;
  cVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)((uVar1 | 0x330208ce) + (uVar1 & 0x330208ce)) * 0x2b +
                     (long)(int)((uVar2 | 0x330208f4) * 2 - (uVar2 ^ 0x330208f4))])();
  if (cVar4 == '\0') {
    uVar1 = -(int)DAT_00275250;
    uVar2 = -(int)DAT_00275250;
    (*(code *)(&DAT_0029e620)
              [(long)(int)((uVar1 ^ 0x330208ce) + (uVar1 & 0x330208ce) * 2) * 0x2b +
               (long)(int)((uVar2 ^ 0x330208f3) + (uVar2 & 0x330208f3) * 2)])();
                    /* WARNING: Could not recover jumptable at 0x001c52d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00276328)();
    return;
  }
  lVar3 = tpidr_el0;
  if (*(long *)(lVar3 + 0x28) == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


