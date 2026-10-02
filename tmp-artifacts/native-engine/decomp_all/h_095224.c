// entry=0x95224

void FUN_00195224(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  uint uVar5;
  
  uVar4 = tpidr_el0;
  uVar2 = -(int)DAT_0027fb18;
  uVar3 = -(int)DAT_0027fb18;
  uVar5 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 | 0x56e407c0) + (uVar3 & 0x56e407c0)) * 300 +
                     (long)(int)((uVar2 | 0x56e40831) + (uVar2 & 0x56e40831))])();
  uVar2 = -(int)DAT_0027fb18;
  uVar3 = -(int)DAT_0027fb18;
  ppuVar1 = &PTR_LAB_0027baa0 + (int)((uVar3 | 0x56e40803) + (uVar3 & 0x56e40803));
  if ((uVar5 & 0xffff) <= (uVar2 ^ 0x56e407c3) + (uVar2 & 0x56e407c3) * 2) {
    ppuVar1 = &PTR_LAB_00280dd8;
  }
                    /* WARNING: Could not recover jumptable at 0x00195388. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


