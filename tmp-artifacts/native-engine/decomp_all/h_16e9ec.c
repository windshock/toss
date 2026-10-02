// entry=0x16e9ec

void FUN_0026e9ec(undefined8 param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar1 = -(int)DAT_0027a058;
  uVar2 = -(int)DAT_0027a058;
                    /* WARNING: Could not recover jumptable at 0x0026ea70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027c058)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar2 | 0xb837bb90) * 2 - (uVar2 ^ 0xb837bb90)) * 300 +
             (long)(int)((uVar1 | 0xb837bc11) * 2 - (uVar1 ^ 0xb837bc11)),param_1,param_2,param_1);
  return;
}


