// entry=0x163f54

void H163f54(void)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  code *unaff_x19;
  code *pcVar5;
  
  lVar3 = (*(code *)PTR_FUN_00283940)();
  uVar4 = (*unaff_x19)((-lVar3 | 0x990ce53f5de4361cU) + (-lVar3 & 0x990ce53f5de4361cU));
  DAT_002862b8 = uVar4;
  iVar1 = (*(code *)PTR_FUN_00283940)();
  iVar2 = (*(code *)PTR_FUN_00283940)();
  pcVar5 = (code *)(&PTR_FUN_0027c1e0)
                   [(long)(int)(0x5de4360b - (-iVar1 ^ 0xffffffffU)) * 300 +
                    (long)(int)((-iVar2 ^ 0x5de4364bU) + (-iVar2 & 0x5de4364bU) * 2)];
  iVar1 = (*(code *)PTR_FUN_00283940)();
  (*pcVar5)(uVar4,0,(-iVar1 | 0x5de4360dU) * 2 - (-iVar1 ^ 0x5de4360dU));
  iVar1 = (*(code *)PTR_FUN_00283940)();
  iVar2 = (*(code *)PTR_FUN_00283940)();
                    /* WARNING: Could not recover jumptable at 0x002640d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027a860)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((-iVar1 | 0x5de4360cU) * 2 - (-iVar1 ^ 0x5de4360cU)) * 300 +
              (long)(int)((-iVar2 | 0x5de43721U) * 2 - (-iVar2 ^ 0x5de43721U))]);
  return;
}


