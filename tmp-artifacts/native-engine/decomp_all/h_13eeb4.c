// entry=0x13eeb4

void H13eeb4(long param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  undefined1 *in_x9;
  
  *in_x9 = 0x74;
  *(undefined1 *)
   (param_1 + (-DAT_00279eb0 | 0x3f63e72908692052U) + (-DAT_00279eb0 & 0x3f63e72908692052U)) = 0x6a;
  *(undefined1 *)(param_1 + 0xd) = 0x73;
  *(undefined1 *)
   (param_1 + (-DAT_00279eb0 | 0x3f63e72908692054U) + (-DAT_00279eb0 & 0x3f63e72908692054U)) = 0;
  iVar4 = (int)DAT_00279eb0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(0x8692045 - (-iVar4 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar4 | 0x86920e8U) + (-iVar4 & 0x86920e8U))])
            ((-iVar4 ^ 0x8692055U) + (-iVar4 & 0x8692055U) * 2,&DAT_0027dae2);
  uVar2 = -(int)DAT_00279eb0;
  uVar3 = -(int)DAT_00279eb0;
  iVar4 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar2 | 0x8692046) + (uVar2 & 0x8692046)) * 300 +
                     (long)(int)((uVar3 | 0x8692088) + (uVar3 & 0x8692088))])();
  ppuVar1 = &PTR_LAB_00275998;
  if (iVar4 != 1) {
    ppuVar1 = (undefined **)&DAT_00278700;
  }
                    /* WARNING: Could not recover jumptable at 0x0023abcc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


