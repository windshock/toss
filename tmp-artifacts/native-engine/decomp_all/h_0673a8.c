// entry=0x673a8

void H654e4(undefined8 param_1)

{
  ulong uVar1;
  ulong in_x10;
  
  do {
    uVar1 = (-DAT_00274f18 ^ 0xae1690869c1eff82U) + (-DAT_00274f18 & 0xae1690869c1eff82U) * 2;
    in_x10 = (in_x10 | uVar1) * 2 - (in_x10 ^ uVar1);
  } while (in_x10 != 0xae1690869c1eff86 - (-DAT_00274f18 ^ 0xffffffffffffffffU));
                    /* WARNING: Could not recover jumptable at 0x00166960. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d918)
            (param_1,-(int)DAT_00274f18 | 0xf7f0e916,(-(int)DAT_00274f18 | 0xf7f0e916U) << 1);
  return;
}


