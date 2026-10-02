// entry=0x140d14

void H140d14(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  int iStack000000000000000c;
  
  lVar1 = tpidr_el0;
  iVar2 = (int)DAT_00279eb0;
  if (**(long **)(lVar1 + ((-DAT_00279eb0 ^ 0x3f63e72908692047U) +
                          (-DAT_00279eb0 & 0x3f63e72908692047U) * 2) * 8) != 0) {
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((-iVar2 | 0x8692046U) + (-iVar2 & 0x8692046U)) * 300 +
               (long)(int)(0x8692059 - (-iVar2 ^ 0xffffffffU))])
              ((-iVar2 | 0x8692046U) + (-iVar2 & 0x8692046U));
                    /* WARNING: Could not recover jumptable at 0x00240a3c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_002800f0)();
    return;
  }
  iStack000000000000000c = 0x8692045 - (-iVar2 ^ 0xffffffffU);
                    /* WARNING: Could not recover jumptable at 0x0023c894. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278900)(&stack0x0000000c,param_1,param_2,0);
  return;
}


