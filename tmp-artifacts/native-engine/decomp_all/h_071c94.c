// entry=0x71c94

void H71c94(long param_1)

{
  undefined **ppuVar1;
  long lVar2;
  
  (&stack0x00000468)
  [param_1 + ((-DAT_00276da8 | 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U)) * 0x80]
       = 0;
  lVar2 = 0x1a0a294d3994d23b - (-DAT_00276da8 ^ 0xffffffffffffffffU);
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_0027c0f8 +
            (long)(int)((-(int)DAT_00276da8 | 0x3994d2a0U) * 2 - (-(int)DAT_00276da8 ^ 0x3994d2a0U))
            * 99;
  if ((ulong)((lVar2 << 0x20) >> (-DAT_00276da8 & 0x3fU)) < 0xfffffffffffff001) {
    ppuVar1 = &PTR_LAB_002751b8;
  }
                    /* WARNING: Could not recover jumptable at 0x00171dd4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(lVar2,&stack0x00000468,
                      (-DAT_00276da8 | 0x1a0a294d3994d2a0U) + (-DAT_00276da8 & 0x1a0a294d3994d2a0U),
                      0x1a0a294d3994d29f - (-DAT_00276da8 ^ 0xffffffffffffffffU));
  return;
}


