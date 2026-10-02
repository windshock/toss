// entry=0x13bdfc

void thunk_FUN_0023b228(undefined8 param_1,undefined8 param_2)

{
  uint uVar1;
  uint uVar2;
  
  CallSupervisor(0);
  uVar1 = -(int)DAT_00279eb0;
  uVar2 = -(int)DAT_00279eb0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar2 | 0x8692046) + (uVar2 & 0x8692046)) * 300 +
             (long)(int)((uVar1 | 0x869205a) + (uVar1 & 0x869205a))])(0,param_2,0);
                    /* WARNING: Could not recover jumptable at 0x00237a6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00276568)();
  return;
}


