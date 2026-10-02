// entry=0x16b2e8

void FUN_0026b2e8(void)

{
  int iVar1;
  undefined1 auVar2 [16];
  
  auVar2 = FUN_001b08dc();
  CallSupervisor(0);
  iVar1 = (int)DAT_00283690;
                    /* WARNING: Could not recover jumptable at 0x0026b360. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0xa9bac036U) + (-iVar1 & 0xa9bac036U)) * 300 +
             (long)(-0x56453f80 - iVar1)])
            (-0x56453fc7 - iVar1,auVar2._8_8_,auVar2._0_8_,auVar2._8_8_);
  return;
}


