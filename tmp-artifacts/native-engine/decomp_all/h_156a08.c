// entry=0x156a08

void H156a08(int param_1,undefined8 param_2,int param_3,uint param_4)

{
  uint uVar1;
  uint in_w14;
  uint in_w16;
  
  uVar1 = param_4 & param_3 << 0x10 | param_4 ^ param_3 << 0x10;
                    /* WARNING: Could not recover jumptable at 0x00256a70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285cb0)
            (uVar1 & param_1 << 0x18 | uVar1 ^ param_1 << 0x18,0xffffffff,
             (in_w16 >> 5 ^ 0xffffffff) & in_w14 << 2 | in_w16 >> 5 & (in_w14 << 2 ^ 0xffffffff),
             (in_w16 << 4 | in_w14 >> 3) & (in_w16 << 4 & in_w14 >> 3 ^ 0xffffffff));
  return;
}


