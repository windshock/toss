// entry=0x71f70

void thunk_FUN_001757a8(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  
  CallSupervisor(0);
  uVar1 = -(int)DAT_00276da8;
  uVar2 = -(int)DAT_00276da8;
                    /* WARNING: Could not recover jumptable at 0x00175888. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002779c0)
            (&PTR_FUN_0027c1e0 +
             (long)(int)((uVar1 | 0x3994d2a0) + (uVar1 & 0x3994d2a0)) * 300 +
             (long)(int)((uVar2 | 0x3994d3b8) * 2 - (uVar2 ^ 0x3994d3b8)),param_1,&stack0x000000e0,
             0x1a0a294d3994d29f - (-DAT_00276da8 ^ 0xffffffffffffffffU),
             0x1a0a294d3994d29f - (-DAT_00276da8 ^ 0xffffffffffffffffU));
  return;
}


