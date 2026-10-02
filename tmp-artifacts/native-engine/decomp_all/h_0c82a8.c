// entry=0xc82a8

void Hc82a8(undefined8 param_1)

{
  uint uVar1;
  
  uVar1 = -(int)DAT_00277d00;
                    /* WARNING: Could not recover jumptable at 0x001c82a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027b3d0)
            (param_1,(&PTR_FUN_0027c1e0)
                     [(long)(int)(0x35be5aeb - (-(int)DAT_00277d00 ^ 0xffffffffU)) * 300 +
                      (long)(int)((uVar1 | 0x35be5b1e) + (uVar1 & 0x35be5b1e))]);
  return;
}


