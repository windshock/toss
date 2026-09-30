// entry_off=1444b8 name=FUN_002444b8 body=[[002444b8, 0024454b] [0024497c, 00244a57] [00244c38, 00244c3b] [00244c5c, 00244cc3] [00244e70, 00244e83]]

void FUN_002444b8(uint param_1,undefined8 param_2,ulong *param_3)

{
  undefined **ppuVar1;
  ulong *puVar2;
  long *plVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  
  iVar4 = (int)DAT_00282ec0;
  if (0xf3f49596 - (-iVar4 ^ 0xffffffffU) <= param_1) {
    puVar2 = (ulong *)(*(code *)(&PTR_FUN_0027c1e0)
                                [(long)(-0xc0b6a6a - iVar4) * 300 +
                                 (long)(int)((-iVar4 ^ 0xf3f495daU) + (-iVar4 & 0x73f495daU) * 2)])
                                (0);
    uVar7 = *param_3;
    plVar3 = (long *)FUN_0026eefc(&DAT_00286190);
    lVar5 = *plVar3;
    uVar6 = *(ulong *)(lVar5 + 0x50);
    *puVar2 = (uVar6 ^ 0xffffffffffffffff) & uVar7 | uVar6 & (uVar7 ^ 0xffffffffffffffff);
    uVar6 = *(ulong *)(lVar5 + 0x58);
    puVar2[1] = (uVar6 ^ 0xffffffffffffffff) & uVar7 | uVar6 & (uVar7 ^ 0xffffffffffffffff);
    ppuVar1 = &PTR_LAB_00280630;
    if ((short)param_3[3] != 0) {
      ppuVar1 = &PTR_LAB_002779e0;
    }
                    /* WARNING: Could not recover jumptable at 0x00244a54. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00244e80. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00281598)(0x642f);
  return;
}


