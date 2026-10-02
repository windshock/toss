// entry=0x16b3d4

void FUN_0026b3d4(int param_1)

{
  undefined **ppuVar1;
  undefined **ppuVar2;
  undefined8 uVar3;
  int iVar4;
  
  uVar3 = tpidr_el0;
  iVar4 = (int)DAT_00278300;
  ppuVar1 = &PTR_LAB_00276f70;
  if (param_1 != (-iVar4 | 0x43d12d53U) * 2 - (-iVar4 ^ 0x43d12d53U)) {
    ppuVar1 = (undefined **)&DAT_00278e88;
  }
  ppuVar2 = &PTR_LAB_002797d8;
  if (param_1 != (-iVar4 ^ 0x43d12d54U) + (-iVar4 & 0x43d12d54U) * 2) {
    ppuVar2 = ppuVar1;
  }
  ppuVar1 = &PTR_LAB_00281838;
  if (param_1 != (-iVar4 | 0x43d12d55U) + (-iVar4 & 0x43d12d55U)) {
    ppuVar1 = ppuVar2;
  }
  ppuVar2 = &PTR_LAB_00281950;
  if (param_1 != 3) {
    ppuVar2 = ppuVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x0026b4cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


