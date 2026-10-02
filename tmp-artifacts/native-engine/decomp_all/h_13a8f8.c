// entry=0x13a8f8

void H13a8f8(void)

{
  ulong uVar1;
  undefined1 *puVar2;
  long lVar3;
  uint in_w8;
  uint in_w9;
  ulong uVar4;
  
  DAT_0027ba98 = in_w9 & in_w8 | in_w9 ^ in_w8;
  DAT_0029e810 = 0;
  uVar1 = (-DAT_00279eb0 | 0x3f63e72908691fe2U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908691fe2U);
  lVar3 = (-DAT_00279eb0 ^ 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U) * 2;
  puVar2 = &DAT_002782e8;
  CallSupervisor(0);
  uVar4 = (long)(uVar1 << 0x20) >> (0x2065 - (-DAT_00279eb0 ^ 0xffffffffffffffffU) & 0x3f);
  if (uVar4 < 0xfffffffffffff001) {
    lVar3 = (-DAT_00279eb0 ^ 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U) * 2;
    puVar2 = &stack0x000001b8;
    CallSupervisor(0);
    CallSupervisor(0);
    uVar1 = uVar4;
  }
                    /* WARNING: Could not recover jumptable at 0x0023ef48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283248)
            (uVar1,puVar2,lVar3,
             (-DAT_00279eb0 ^ 0x3f63e72908692046U) + (-DAT_00279eb0 & 0x3f63e72908692046U) * 2);
  return;
}


