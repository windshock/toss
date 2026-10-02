// entry=0x79574

void H79574(void)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_00285db0;
  uVar2 = -(int)DAT_00285db0;
                    /* WARNING: Could not recover jumptable at 0x00179618. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00282af8)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar1 | 0x3c194cd5) + (uVar1 & 0x3c194cd5)) * 300 +
              (long)(int)((uVar2 ^ 0x3c194de0) + (uVar2 & 0x3c194de0) * 2)]);
  return;
}


