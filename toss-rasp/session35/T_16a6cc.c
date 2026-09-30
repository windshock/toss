// entry=0016a6cc name=FUN_0016a6cc

void FUN_0016a6cc(void)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x0016a8a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002795f8)
            [(long)(int)((-(int)DAT_00283cb8 | 0x58495402U) * 2 - (-(int)DAT_00283cb8 ^ 0x58495402U)
                        ) * 0x6e])();
  return;
}

