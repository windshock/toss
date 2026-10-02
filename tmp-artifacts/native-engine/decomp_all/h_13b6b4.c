// entry=0x13b6b4

void thunk_FUN_0023b124(undefined8 param_1,long param_2)

{
  undefined **ppuVar1;
  long lVar2;
  
  (&stack0x000001bc)[param_2] = 0;
  lVar2 = 0x3f63e72908691fe1 - (-DAT_00279eb0 ^ 0xffffffffffffffffU);
  CallSupervisor(0);
  ppuVar1 = &PTR_LAB_00279540;
  if ((ulong)((lVar2 << 0x20) >> ((-DAT_00279eb0 ^ 0x2066U) + (-DAT_00279eb0 & 0x2066U) * 2 & 0x3f))
      < 0xfffffffffffff001) {
    ppuVar1 = &PTR_H13a5fc_0027d808;
  }
                    /* WARNING: Could not recover jumptable at 0x0023b20c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(lVar2,&stack0x000001bc,&stack0x00000010,
                      (-DAT_00279eb0 ^ 0x3f63e72908692146U) +
                      (-DAT_00279eb0 & 0x3f63e72908692146U) * 2);
  return;
}


