// entry=0xbec10

void FUN_001bec10(void)

{
  uint uVar1;
  undefined8 uVar2;
  
  uVar2 = tpidr_el0;
  uVar1 = -(int)DAT_00274ad8;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0x23e66cf0) + (uVar1 & 0x23e66cf0)) * 300 +
             (long)(int)(0x23e66d87 - (-(int)DAT_00274ad8 ^ 0xffffffffU))])();
                    /* WARNING: Could not recover jumptable at 0x001c0530. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027fe88)();
  return;
}


