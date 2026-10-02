// entry=0x1602a4

void FUN_002602a4(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_00281e50;
                    /* WARNING: Could not recover jumptable at 0x00260324. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e078)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar1 ^ 0xa95a45e5) + (uVar1 & 0xa95a45e5) * 2) * 300 +
             (long)(int)(-0x56a5b961 - (-(int)DAT_00281e50 ^ 0xffffffffU)),param_1,param_2,param_1,
             param_4,param_3);
  return;
}


